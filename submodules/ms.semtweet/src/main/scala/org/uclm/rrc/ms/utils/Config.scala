package org.uclm.rrc.ms.utils

trait Config {
  val httpInterface = System.getenv("SEMTWEET_HTTP_INTERFACE")
  val httpPort = System.getenv("SEMTWEET_HTTP_PORT").toInt
  val outputInterface = System.getenv("SEMTWEET_OUTPUT_HTTP_INTERFACE")
  val outputPort = System.getenv("SEMTWEET_OUTPUT_HTTP_PORT").toInt
  val outputService = System.getenv("SEMTWEET_OUTPUT_HTTP_SERVICE")
}


