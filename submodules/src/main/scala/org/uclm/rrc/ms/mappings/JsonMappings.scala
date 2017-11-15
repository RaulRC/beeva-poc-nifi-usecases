package org.uclm.rrc.ms.mappings

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import org.uclm.rrc.ms.models._
import spray.json.DefaultJsonProtocol

trait JsonMappings extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val hashtagFormat = jsonFormat2(Hashtag.apply)
  implicit val entityFormat = jsonFormat1(Entity.apply)
  implicit val userFormat = jsonFormat10(User.apply)
  implicit val coordFormat = jsonFormat2(Coordinate.apply)
  implicit val tweetFormat = jsonFormat13(Tweet.apply)
  implicit val itemEntityFormat = jsonFormat2(ItemEntity.apply)
  implicit val bodyEntityFormat = jsonFormat1(BodyEntity)
  implicit val headerEntityFormat = jsonFormat1(HeaderEntity)
  implicit val messageFormatPolicy = jsonFormat3(MessageEntityPolicy)
  implicit val metadataResponse = jsonFormat3(Metadata)
  implicit val resultMetadataResponse = jsonFormat4(ResultMetadata)
  implicit val accessesEntity = jsonFormat2(Accesses)
  implicit val EndPointResponse = jsonFormat4(EndPoint)
  implicit val DescriptionResponse = jsonFormat2(DescriptionEntity)
  implicit val responseAuthCompany = jsonFormat3(ResultMsAuthGetCompany)
  implicit val responseAuthSector = jsonFormat3(ResultMsAuthGetAuth)
  implicit val resultService = jsonFormat2(ResultServiceTweet)
  }
