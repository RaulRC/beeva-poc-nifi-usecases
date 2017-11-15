package org.uclm.rrc.ms.models

case class User(id: Int, id_str: String, name: String, verified: Boolean, followers_count: Long,
                friends_count: Long, favourites_count: Long, created_at: String,
                lang: String, time_zone: Option[String])

case class Coordinate(coordinates: Array[Double], `type`: String)

case class Hashtag(indices: Array[Int], text: String)

case class Entity(hashtags: Array[Hashtag])

case class Tweet (created_at: String, id: Int, id_str: String, text: String,
                  source: String, truncated: Boolean,
                  retweet_count: Long, favorite_count: Long, lang: String,
                  timestamp_ms: String, user: User, coordinates: Option[Coordinate], entities: Entity)



