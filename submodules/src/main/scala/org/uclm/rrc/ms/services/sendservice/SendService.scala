package org.uclm.rrc.ms.services.sendservice

import java.util.logging.Logger

import akka.actor.ActorSystem
import akka.stream.Materializer
import org.apache.jena.rdf.model.Model
import org.uclm.rrc.ms.services.semantic.Semtweet
import org.uclm.rrc.ms.utils.Config

import scala.concurrent.ExecutionContextExecutor
import scalaj.http.{HttpOptions, HttpResponse}

trait SendService extends Config with Semtweet{

  private[this] val logger = Logger.getLogger(getClass().getName())

  implicit val system: ActorSystem
  implicit def executor: ExecutionContextExecutor
  implicit val materializer: Materializer

  val RDF = "RDF/XML-ABBREV"
  val N3 = "N-TRIPLE"
  val TTL = "TURTLE"

  def sendModel(model: Model): HttpResponse[String] = {
    scalaj.http.Http("http://" + outputInterface + ":" + outputPort + "/" + outputService)
    .options(scalaj.http.HttpOptions.allowUnsafeSSL, HttpOptions.method("POST"))
      .postData(modelToString(model, RDF)).asString
  }

}
