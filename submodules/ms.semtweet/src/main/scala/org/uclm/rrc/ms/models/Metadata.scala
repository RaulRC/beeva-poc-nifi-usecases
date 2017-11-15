package org.uclm.rrc.ms.models

case class Metadata(timestamp: Long, topic: String, partition: Int)

case class ResultMetadata(statusCode: Int, code: String, message: String, data: Option[Metadata] = None)

case class ResultMsAuthGetCompany(company: String, authorized: Boolean, message: String)

case class ResultMsAuthGetAuth(user: String, authorized: Boolean, message: String)

case class ResultServiceTweet(code: String, message: String)

