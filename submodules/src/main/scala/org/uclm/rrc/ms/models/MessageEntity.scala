package org.uclm.rrc.ms.models

case class MessageEntity(company: String, authorized: Boolean, message: String)

case class MessageEntityPolicy(user: String, authorized: Boolean, message: String)
