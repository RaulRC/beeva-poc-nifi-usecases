package org.uclm.rrc.ms

import akka.actor.ActorSystem
import akka.event.{Logging, LoggingAdapter}
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import org.uclm.rrc.ms.routes.Routes
import org.uclm.rrc.ms.utils.Config

object Main extends App with Config with Routes{
  implicit val system = ActorSystem()
  implicit val executor = system.dispatcher
  implicit val materializer = ActorMaterializer()

  val log: LoggingAdapter = Logging(system, getClass)

  log.info("[MS_SEMTWEET] Up and running!")
  Http().bindAndHandle(routes, interface = httpInterface, port = httpPort)
}
