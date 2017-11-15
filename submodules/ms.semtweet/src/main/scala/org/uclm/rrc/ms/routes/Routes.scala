package org.uclm.rrc.ms.routes

import akka.http.scaladsl.server.Directives._
import org.uclm.rrc.ms.models._

trait Routes extends ApiErrorHandler with TweetAPI {
  /*val itemEP = ItemEntity("sector", "sector name")
  val bodyEP = BodyEntity(List(itemEP))
  val authEP = EndPoint("/authentication/company", "GET", headEP, nbodEP)
  val poliEP = EndPoint("/authentication/policies", "POST", headEP, bodyEP)
  */

  val nbodEP = BodyEntity(List())
  val headEP = HeaderEntity(List())
  val freeEP = EndPoint("/tweet", "POST", headEP, nbodEP)
  val descrp = DescriptionEntity(List(freeEP), "1.0")
  val routes =
    path(""){
      get{
        complete(descrp)
      }
    }~
    pathPrefix("datavault") {
      pathPrefix("v1") {
        tweetAPI
      }
    }
}
