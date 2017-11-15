package org.uclm.rrc.ms.models

case class Accesses(`type`: String, isAllowed: Boolean)

case class ItemEntity(keyItem: String, valueItem: String)

case class BodyEntity(bodyElements: List[ItemEntity])

case class HeaderEntity(headerElements: List[ItemEntity])

case class EndPoint(path: String, method: String, header: HeaderEntity, body: BodyEntity)

case class DescriptionEntity(paths : List[EndPoint], version: String)

