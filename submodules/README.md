### MICROSERVICE

GET http://localhost:9003
```json
{
  "paths": [{
    "path": "/tweet",
    "method": "POST",
    "header": {
      "headerElements": []
    },
    "body": {
      "bodyElements": []
    }
  }],
  "version": "1.0"
}
```
Tweet example post: 

POST http://localhost:9003/datavault/v1/tweet -d '

```json
{
	"created_at": "Sat Oct 14 19:42:13 +0000 2017",
	"id": 919287245005381632,
	"id_str": "919287245005381632",
	"text": "Awful news https:\/\/t.co\/oOx5Nodeax",
	"display_text_range": [0, 10],
	"source": "\u003ca href=\"http:\/\/twitter.com\/download\/android\" rel=\"nofollow\"\u003eTwitter for Android\u003c\/a\u003e",
	"truncated": false,
	"in_reply_to_status_id": null,
	"in_reply_to_status_id_str": null,
	"in_reply_to_user_id": null,
	"in_reply_to_user_id_str": null,
	"in_reply_to_screen_name": null,
	"user": {
		"id": 3009319445,
		"id_str": "3009319445",
		"name": "Schumi",
		"screen_name": "Schumacherf2015",
		"location": null,
		"url": null,
		"description": "the late great Colonel Sanders once said , I'm too drunk to taste this chicken",
		"translator_type": "none",
		"protected": false,
		"verified": false,
		"followers_count": 174,
		"friends_count": 191,
		"listed_count": 5,
		"favourites_count": 4036,
		"statuses_count": 13044,
		"created_at": "Sun Feb 01 04:49:21 +0000 2015",
		"utc_offset": null,
		"time_zone": null,
		"geo_enabled": false,
		"lang": "en",
		"contributors_enabled": false,
		"is_translator": false,
		"profile_background_color": "C0DEED",
		"profile_background_image_url": "http:\/\/abs.twimg.com\/images\/themes\/theme1\/bg.png",
		"profile_background_image_url_https": "https:\/\/abs.twimg.com\/images\/themes\/theme1\/bg.png",
		"profile_background_tile": false,
		"profile_link_color": "1DA1F2",
		"profile_sidebar_border_color": "C0DEED",
		"profile_sidebar_fill_color": "DDEEF6",
		"profile_text_color": "333333",
		"profile_use_background_image": true,
		"profile_image_url": "http:\/\/pbs.twimg.com\/profile_images\/915153783197335553\/zCOG3GYu_normal.jpg",
		"profile_image_url_https": "https:\/\/pbs.twimg.com\/profile_images\/915153783197335553\/zCOG3GYu_normal.jpg",
		"profile_banner_url": "https:\/\/pbs.twimg.com\/profile_banners\/3009319445\/1505793855",
		"default_profile": true,
		"default_profile_image": false,
		"following": null,
		"follow_request_sent": null,
		"notifications": null
	},
	"geo": null,
	"coordinates": null,
	"place": null,
	"contributors": null,
	"quoted_status_id": 919269920923357184,
	"quoted_status_id_str": "919269920923357184",
	"quoted_status": {
		"created_at": "Sat Oct 14 18:33:23 +0000 2017",
		"id": 919269920923357184,
		"id_str": "919269920923357184",
		"text": "Source: Patriots LB Harvey Langi was involved in a car accident w\/ wife last night. Injuries are considered serious but not life-threatening",
		"source": "\u003ca href=\"http:\/\/twitter.com\/download\/iphone\" rel=\"nofollow\"\u003eTwitter for iPhone\u003c\/a\u003e",
		"truncated": false,
		"in_reply_to_status_id": null,
		"in_reply_to_status_id_str": null,
		"in_reply_to_user_id": null,
		"in_reply_to_user_id_str": null,
		"in_reply_to_screen_name": null,
		"user": {
			"id": 21995237,
			"id_str": "21995237",
			"name": "Doug Kyed",
			"screen_name": "DougKyed",
			"location": "MetroWest, Mass.",
			"url": "http:\/\/nesn.com\/patriots",
			"description": "Patriots beat reporter for http:\/\/NESN.com, @NESN. Email: dkyed@nesn.com. Insta: dougkyed. Last name rhymes with dyed.",
			"translator_type": "none",
			"protected": false,
			"verified": true,
			"followers_count": 25897,
			"friends_count": 464,
			"listed_count": 946,
			"favourites_count": 7496,
			"statuses_count": 77805,
			"created_at": "Thu Feb 26 10:01:17 +0000 2009",
			"utc_offset": -14400,
			"time_zone": "Eastern Time (US & Canada)",
			"geo_enabled": true,
			"lang": "en",
			"contributors_enabled": false,
			"is_translator": false,
			"profile_background_color": "C0DEED",
			"profile_background_image_url": "http:\/\/pbs.twimg.com\/profile_background_images\/670073568\/770d3d54a9cbb02b7790cb88d23c8c50.jpeg",
			"profile_background_image_url_https": "https:\/\/pbs.twimg.com\/profile_background_images\/670073568\/770d3d54a9cbb02b7790cb88d23c8c50.jpeg",
			"profile_background_tile": true,
			"profile_link_color": "008080",
			"profile_sidebar_border_color": "FFFFFF",
			"profile_sidebar_fill_color": "DDEEF6",
			"profile_text_color": "333333",
			"profile_use_background_image": true,
			"profile_image_url": "http:\/\/pbs.twimg.com\/profile_images\/899852349308403714\/SVZreH5u_normal.jpg",
			"profile_image_url_https": "https:\/\/pbs.twimg.com\/profile_images\/899852349308403714\/SVZreH5u_normal.jpg",
			"profile_banner_url": "https:\/\/pbs.twimg.com\/profile_banners\/21995237\/1505005908",
			"default_profile": false,
			"default_profile_image": false,
			"following": null,
			"follow_request_sent": null,
			"notifications": null
		},
		"geo": null,
		"coordinates": null,
		"place": null,
		"contributors": null,
		"is_quote_status": false,
		"quote_count": 98,
		"reply_count": 27,
		"retweet_count": 207,
		"favorite_count": 197,
		"entities": {
			"hashtags": [],
			"urls": [],
			"user_mentions": [],
			"symbols": []
		},
		"favorited": false,
		"retweeted": false,
		"filter_level": "low",
		"lang": "en"
	},
	"is_quote_status": true,
	"quote_count": 0,
	"reply_count": 0,
	"retweet_count": 0,
	"favorite_count": 0,
	"entities": {
		"hashtags": [],
		"urls": [{
			"url": "https:\/\/t.co\/oOx5Nodeax",
			"expanded_url": "https:\/\/twitter.com\/DougKyed\/status\/919269920923357184",
			"display_url": "twitter.com\/DougKyed\/statu\u2026",
			"indices": [11, 34]
		}],
		"user_mentions": [],
		"symbols": []
	},
	"favorited": false,
	"retweeted": false,
	"possibly_sensitive": false,
	"filter_level": "low",
	"lang": "en",
	"timestamp_ms": "1508010133397"
}
```
'

Result: 

```xml
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLang> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#language> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLang> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLang> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isVerified> "false"^^<http://www.w3.org/2001/XMLSchema#boolean> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserLang> "pt"^^<http://www.w3.org/2001/XMLSchema#language> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserId> "237720874"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserFavouriteCount> "79588"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserCreationDate> "Thu Jan 13 13:37:52 +0000 2011"^^<http://www.w3.org/2001/XMLSchema#date> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeZone> "Brasilia"^^<http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasName> "Leonardo M.Monteiro"^^<http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFollowersCount> "2409"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
_:A8e720a67X2dX8152X2dX4f18X2dXa5aaX2dXe5f1ece4a303 <http://www.w3.org/1999/02/22-rdf-syntax-ns#rest> _:A0d0fe620X2dXcf24X2dX42bdX2dXb183X2dX88bf1bb5fa2f .
_:A8e720a67X2dX8152X2dX4f18X2dXa5aaX2dXe5f1ece4a303 <http://www.w3.org/1999/02/22-rdf-syntax-ns#first> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hashtag> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCoordinates> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coordinates> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCoordinates> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCoordinates> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#ObjectProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasht_919287321186439169> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hashtag> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasText> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasText> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasText> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasId> "819797"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUser> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User1> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCoordinates> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coord1> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet1> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#NamedIndividual> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coordinates> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Class> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeStampMs> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#unsignedLong> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeStampMs> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeStampMs> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserFavouriteCount> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserFavouriteCount> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserFavouriteCount> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserId> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserId> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserId> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtagValue> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtagValue> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hashtag> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtagValue> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Class> .
_:A248751d8X2dX6f6dX2dX4b89X2dXb998X2dXad0b05bd8f4a <http://www.w3.org/1999/02/22-rdf-syntax-ns#rest> _:A8e720a67X2dX8152X2dX4f18X2dXa5aaX2dXe5f1ece4a303 .
_:A248751d8X2dX6f6dX2dX4b89X2dXb998X2dXad0b05bd8f4a <http://www.w3.org/1999/02/22-rdf-syntax-ns#first> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coordinates> .
_:A466586e7X2dX14e6X2dX4f31X2dXae98X2dXaaac617e5414 <http://www.w3.org/1999/02/22-rdf-syntax-ns#rest> <http://www.w3.org/1999/02/22-rdf-syntax-ns#nil> .
_:A466586e7X2dX14e6X2dX4f31X2dXae98X2dXaaac617e5414 <http://www.w3.org/1999/02/22-rdf-syntax-ns#first> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtag> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hashtag> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtag> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtag> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#ObjectProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#coord_919287321186439169> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coordinates> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFavouriteCount> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFavouriteCount> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFavouriteCount> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLatitude> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#double> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLatitude> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coordinates> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLatitude> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isVerified> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#boolean> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isVerified> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isVerified> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUser> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUser> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUser> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#ObjectProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTextSource> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#normalizedString> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTextSource> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTextSource> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
_:A0d0fe620X2dXcf24X2dX42bdX2dXb183X2dX88bf1bb5fa2f <http://www.w3.org/1999/02/22-rdf-syntax-ns#rest> _:A466586e7X2dX14e6X2dX4f31X2dXae98X2dXaaac617e5414 .
_:A0d0fe620X2dXcf24X2dX42bdX2dXb183X2dX88bf1bb5fa2f <http://www.w3.org/1999/02/22-rdf-syntax-ns#first> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCreationDate> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#dateTime> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCreationDate> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCreationDate> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Class> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasRetweetCount> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasRetweetCount> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasRetweetCount> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeStampMs> "1508010151560"^^<http://www.w3.org/2001/XMLSchema#unsignedLong> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasText> "RT @JohnnyFocal: Quentin Tarantino Breaks Silence on Harvey Weinstein: \u2018Stunned and Heartbroken\u2019 https://t.co/bgHsxi07rk"^^<http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFavouriteCount> "0"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isTruncated> "false"^^<http://www.w3.org/2001/XMLSchema#boolean> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasCreationDate> "Sat Oct 14 19:42:31 +0000 2017"^^<http://www.w3.org/2001/XMLSchema#date> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasId> "-1311338495"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUser> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#user_237720874> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLang> "en"^^<http://www.w3.org/2001/XMLSchema#language> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasRetweetCount> "0"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtag> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasht_919287321186439169> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#tweet_919287321186439169> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTextSource> "<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter Web Client</a>"^^<http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasName> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasName> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasName> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFollowersCount> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFollowersCount> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasFollowersCount> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Entity> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Class> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Ontology> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isTruncated> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#boolean> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isTruncated> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isTruncated> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coord1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLongitude> "-75.14310264"^^<http://www.w3.org/2001/XMLSchema#double> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coord1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLatitude> "40.05701649"^^<http://www.w3.org/2001/XMLSchema#double> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coord1> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#NamedIndividual> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hash1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasHashtagValue> "#TestHashtag"^^<http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hash1> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#NamedIndividual> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#isVerified> "true"^^<http://www.w3.org/2001/XMLSchema#boolean> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User1> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserId> "819797"^^<http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User1> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#NamedIndividual> .
_:A9c599513X2dX3a07X2dX49a0X2dXbf02X2dX82caadc08a56 <http://www.w3.org/2002/07/owl#members> _:A248751d8X2dX6f6dX2dX4b89X2dXb998X2dXad0b05bd8f4a .
_:A9c599513X2dX3a07X2dX49a0X2dXbf02X2dX82caadc08a56 <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#AllDisjointClasses> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeZone> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#string> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeZone> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasTimeZone> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hashtag> <http://www.w3.org/2000/01/rdf-schema#subClassOf> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Entity> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Hashtag> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#Class> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserLang> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#language> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserLang> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserLang> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasId> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#long> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasId> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Tweet> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasId> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserCreationDate> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#dateTime> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserCreationDate> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#User> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasUserCreationDate> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLongitude> <http://www.w3.org/2000/01/rdf-schema#range> <http://www.w3.org/2001/XMLSchema#double> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLongitude> <http://www.w3.org/2000/01/rdf-schema#domain> <http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#Coordinates> .
<http://www.semanticweb.org/rrc/ontologies/2017/7/semtweet#hasLongitude> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.w3.org/2002/07/owl#DatatypeProperty> .
```
