package org.uclm.rrc.ms.services.semantic
import java.io.{File, IOException, PrintWriter, StringWriter}
import java.util.logging.Logger

import akka.actor.ActorSystem
import akka.stream.Materializer
import org.apache.jena.datatypes.xsd.XSDDatatype
import org.apache.jena.ontology.{Individual, OntModel, OntModelSpec}
import org.apache.jena.rdf.model.{Model, ModelFactory, Property}
import org.apache.jena.util.FileManager
import org.uclm.rrc.ms.models.{Coordinate, Tweet}

import scala.concurrent.ExecutionContextExecutor

trait Semtweet {

  private[this] val logger = Logger.getLogger(getClass().getName())

  implicit val system: ActorSystem
  implicit def executor: ExecutionContextExecutor
  implicit val materializer: Materializer

  var ontFile = "ontotwitter/semtweets.owl"
  val nameSpace = "http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet"
  val prefix = "semtweet:"
  val TWEET = nameSpace + "#Tweet"
  val USER = nameSpace + "#User"
  val COORD = nameSpace + "#Coordinates"
  val HASH = nameSpace + "#Hashtag"

  def modelToString(model: Model, format: String): String = {
    val out: StringWriter = new StringWriter()
    model.write(out, format)
    out.toString()
  }

  def generateFile(tweet: Tweet, model: Model): File = {
    val outputFile = new File("outputs/" + tweet.id_str + ".rdf")
    val pw = new PrintWriter(outputFile)
    model.write(pw)
    outputFile
  }

  def semTweet(tweet: Tweet): Model = {
    var resultModel = ModelFactory.createDefaultModel()
    val ontTweet  = getOntologyModel(ontFile)

    //Classes
    var cTweet = ontTweet.getOntClass(TWEET)
    var cUser = ontTweet.getOntClass(USER)
    var cCoords = ontTweet.getOntClass(COORD)
    var cHash = ontTweet.getOntClass(HASH)
    //Data Properties
    // - tweet
    val hasId: Property = ontTweet.getOntProperty(nameSpace + "#hasId")
    val hasCreationDate = ontTweet.getOntProperty(nameSpace + "#hasCreationDate")
    val hasFavouriteCount = ontTweet.getOntProperty(nameSpace + "#hasFavouriteCount")
    val hasLang = ontTweet.getOntProperty(nameSpace + "#hasLang")
    val hasRetweetCount = ontTweet.getOntProperty(nameSpace + "#hasRetweetCount")
    val hasText = ontTweet.getOntProperty(nameSpace + "#hasText")
    val hasTextSource = ontTweet.getOntProperty(nameSpace + "#hasTextSource")
    val hasTimeStampMs = ontTweet.getOntProperty(nameSpace + "#hasTimeStampMs")
    val isTruncated = ontTweet.getOntProperty(nameSpace + "#isTruncated")
    // -- object properties
    val hasCoordinates = ontTweet.getOntProperty(nameSpace + "#hasCoordinates")
    val hasUser = ontTweet.getOntProperty(nameSpace + "#hasUser")
    val hasHashtag = ontTweet.getOntProperty(nameSpace + "#hasHashtag")

    // - user
    val hasFollowersCount = ontTweet.getOntProperty(nameSpace + "#hasFollowersCount")
    val hasName = ontTweet.getOntProperty(nameSpace + "#hasName")
    val hasUserCreationDate = ontTweet.getOntProperty(nameSpace + "#hasUserCreationDate")
    val hasUserFavouriteCount = ontTweet.getOntProperty(nameSpace + "#hasUserFavouriteCount")
    val hasUserId = ontTweet.getOntProperty(nameSpace + "#hasUserId")
    val hasUserLang = ontTweet.getOntProperty(nameSpace + "#hasUserLang")
    val hasTimeZone = ontTweet.getOntProperty(nameSpace + "#hasTimeZone")
    val isVerified = ontTweet.getOntProperty(nameSpace + "#isVerified")

    // - hashtag
    val hasHashtagValue = ontTweet.getOntProperty(nameSpace + "#hasHashtagValue")

    // - coordinates
    val hasLatitude = ontTweet.getOntProperty(nameSpace + "#hasLatitude")
    val hasLongitude = ontTweet.getOntProperty(nameSpace + "#hasLongitude")

    val t1: Individual = ontTweet.createIndividual(nameSpace + "#tweet_" + tweet.id_str, cTweet)
    val u1: Individual = ontTweet.createIndividual(nameSpace + "#user_" + tweet.user.id_str, cUser)
    val c1: Individual = ontTweet.createIndividual(nameSpace + "#coord_" + tweet.id_str, cCoords)
    val h1: Individual = ontTweet.createIndividual(nameSpace + "#hasht_" + tweet.id_str, cHash)
    //Tweet Properties
    t1.addProperty(hasId, tweet.id.toString(), XSDDatatype.XSDlong)
    t1.addProperty(hasCreationDate, tweet.created_at, XSDDatatype.XSDdate)
    t1.addProperty(hasFavouriteCount, tweet.favorite_count.toString(), XSDDatatype.XSDlong)
    t1.addProperty(hasLang, tweet.lang, XSDDatatype.XSDlanguage)
    t1.addProperty(hasRetweetCount, tweet.retweet_count.toString(), XSDDatatype.XSDlong)
    t1.addProperty(hasText, tweet.text)
    t1.addProperty(hasTextSource, tweet.source)
    t1.addProperty(hasTimeStampMs, tweet.timestamp_ms.toString(), XSDDatatype.XSDunsignedLong)
    t1.addProperty(isTruncated, tweet.truncated.toString(), XSDDatatype.XSDboolean)
    // - object properties
    //t1.addProperty(hasCoordinates, c1) see below @ Coordinates
    t1.addProperty(hasUser, u1)
    t1.addProperty(hasHashtag, h1)

    //User
    u1.addProperty(hasFollowersCount, tweet.user.followers_count.toString(), XSDDatatype.XSDlong)
    u1.addProperty(hasName,tweet.user.name)
    u1.addProperty(hasTimeZone,tweet.user.time_zone.getOrElse("no_timezone"))
    u1.addProperty(hasUserCreationDate, tweet.user.created_at, XSDDatatype.XSDdate)
    u1.addProperty(hasUserFavouriteCount, tweet.user.favourites_count.toString(), XSDDatatype.XSDlong)
    u1.addProperty(hasUserId, tweet.user.id.toString(), XSDDatatype.XSDlong)
    u1.addProperty(hasUserLang, tweet.user.lang, XSDDatatype.XSDlanguage)
    u1.addProperty(isVerified, tweet.user.verified.toString(), XSDDatatype.XSDboolean)

    //Hashtag
    tweet.entities.hashtags.map(x => h1.addProperty(hasHashtagValue, x.text))

    //Coordinates
    val coords: Coordinate = tweet.coordinates.getOrElse(Coordinate(Array(0.0,0.0), "null"))
    if (!coords.`type`.equals("null")){
      c1.addProperty(hasLongitude, coords.coordinates(0).toString(), XSDDatatype.XSDdouble)
      c1.addProperty(hasLatitude, coords.coordinates(1).toString(), XSDDatatype.XSDdouble)
      t1.addProperty(hasCoordinates, c1)
    }
    ontTweet
  }


  def getOntologyModel(ontFile: String): OntModel = {
    val ontoModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null)
    try{
      val in = FileManager.get().open(ontFile)
      ontoModel.read(in, null)
    }
    catch {
      case e: Exception => e.printStackTrace()
    }
    ontoModel
  }

}
