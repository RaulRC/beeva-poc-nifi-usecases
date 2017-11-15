package org.uclm.rrc.ms.routes

import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}
import org.apache.jena.rdf.model.Model
import org.scalatest.mockito.MockitoSugar

import scalaj.http.HttpResponse



/**
  * Created by Raul Reguillo on 29/08/17.
  */
//Integration
@RunWith(classOf[JUnitRunner])
class RouteServiceTest extends WordSpec with Matchers with MyRoutes with ScalatestRouteTest{
  val route_pathPrefix = "/datavault/v1/tweet"
  val aTweet =
    """
      |{
      |	"created_at": "Tue Aug 29 13:49:14 +0000 2017",
      |	"id": 902528572262371328,
      |	"id_str": "902528572262371328",
      |	"text": "RT @applancer_crypt: Top ICOs to invest\nhttps:\/\/t.co\/NH2Hdg8OZV\n@easymineio @SolarDAO @jincor_ico @SmartRE_Info @Cashpoker\u2026 ",
      |	"source": "\u003ca href=\"http:\/\/twitter.com\/download\/android\" rel=\"nofollow\"\u003eTwitter for Android\u003c\/a\u003e",
      |	"truncated": false,
      |	"in_reply_to_status_id": null,
      |	"in_reply_to_status_id_str": null,
      |	"in_reply_to_user_id": null,
      |	"in_reply_to_user_id_str": null,
      |	"in_reply_to_screen_name": null,
      |	"user": {
      |		"id": 893245083474120704,
      |		"id_str": "893245083474120704",
      |		"name": "\u0414\u0438\u043c\u0430 \u0421\u0442\u0430\u0440\u0438\u043a\u043e\u0432",
      |		"screen_name": "oeowvtka2157",
      |		"location": null,
      |		"url": null,
      |		"description": "\u0432\u0441\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u044f \u0438 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u0436\u0438 \u0432\u044b\u043c\u044b\u0448\u043b\u0435\u043d\u043d\u044b\u0435, \u0430 \u043b\u0431\u044b\u0435 \u0441\u043e\u043f\u0430\u0434\u0435\u043d\u0438\u044f \u0441\u043b\u0443\u0447\u0430\u043d\u044b.",
      |		"translator_type": "none",
      |		"protected": false,
      |		"verified": false,
      |		"followers_count": 1,
      |		"friends_count": 34,
      |		"listed_count": 0,
      |		"favourites_count": 69,
      |		"statuses_count": 136,
      |		"created_at": "Thu Aug 03 22:59:58 +0000 2017",
      |		"utc_offset": null,
      |		"time_zone": null,
      |		"geo_enabled": false,
      |		"lang": "en",
      |		"contributors_enabled": false,
      |		"is_translator": false,
      |		"profile_background_color": "F5F8FA",
      |		"profile_background_image_url": "",
      |		"profile_background_image_url_https": "",
      |		"profile_background_tile": false,
      |		"profile_link_color": "1DA1F2",
      |		"profile_sidebar_border_color": "C0DEED",
      |		"profile_sidebar_fill_color": "DDEEF6",
      |		"profile_text_color": "333333",
      |		"profile_use_background_image": true,
      |		"profile_image_url": "http:\/\/pbs.twimg.com\/profile_images\/893251532979789824\/TyQDVm43_normal.jpg",
      |		"profile_image_url_https": "https:\/\/pbs.twimg.com\/profile_images\/893251532979789824\/TyQDVm43_normal.jpg",
      |		"profile_banner_url": "https:\/\/pbs.twimg.com\/profile_banners\/893245083474120704\/1501802587",
      |		"default_profile": true,
      |		"default_profile_image": false,
      |		"following": null,
      |		"follow_request_sent": null,
      |		"notifications": null
      |	},
      |	"geo": null,
      |	"coordinates": null,
      |	"place": null,
      |	"contributors": null,
      |	"retweeted_status": {
      |		"created_at": "Tue Aug 29 13:37:07 +0000 2017",
      |		"id": 902525523506511872,
      |		"id_str": "902525523506511872",
      |		"text": "Top ICOs to invest\nhttps:\/\/t.co\/NH2Hdg8OZV\n@easymineio @SolarDAO @jincor_ico @SmartRE_Info @Cashpoker\u2026 https:\/\/t.co\/DBFvIqYKZD",
      |		"display_text_range": [0, 140],
      |		"source": "\u003ca href=\"http:\/\/twitter.com\" rel=\"nofollow\"\u003eTwitter Web Client\u003c\/a\u003e",
      |		"truncated": true,
      |		"in_reply_to_status_id": null,
      |		"in_reply_to_status_id_str": null,
      |		"in_reply_to_user_id": null,
      |		"in_reply_to_user_id_str": null,
      |		"in_reply_to_screen_name": null,
      |		"user": {
      |			"id": 3316078646,
      |			"id_str": "3316078646",
      |			"name": "Applancer Crypto",
      |			"screen_name": "applancer_crypt",
      |			"location": null,
      |			"url": "https:\/\/www.applancer.co\/ico-list",
      |			"description": "Applancer lists the Latest ICOs\n#ICOs #Crypto #Bitcoin #Ethereum #Daytraders",
      |			"translator_type": "none",
      |			"protected": false,
      |			"verified": false,
      |			"followers_count": 16513,
      |			"friends_count": 1002,
      |			"listed_count": 16,
      |			"favourites_count": 370,
      |			"statuses_count": 560,
      |			"created_at": "Sat Aug 15 15:35:01 +0000 2015",
      |			"utc_offset": -25200,
      |			"time_zone": "Pacific Time (US & Canada)",
      |			"geo_enabled": false,
      |			"lang": "en",
      |			"contributors_enabled": false,
      |			"is_translator": false,
      |			"profile_background_color": "000000",
      |			"profile_background_image_url": "http:\/\/abs.twimg.com\/images\/themes\/theme1\/bg.png",
      |			"profile_background_image_url_https": "https:\/\/abs.twimg.com\/images\/themes\/theme1\/bg.png",
      |			"profile_background_tile": false,
      |			"profile_link_color": "31376D",
      |			"profile_sidebar_border_color": "000000",
      |			"profile_sidebar_fill_color": "000000",
      |			"profile_text_color": "000000",
      |			"profile_use_background_image": false,
      |			"profile_image_url": "http:\/\/pbs.twimg.com\/profile_images\/891895894668304384\/LWQK9EUX_normal.jpg",
      |			"profile_image_url_https": "https:\/\/pbs.twimg.com\/profile_images\/891895894668304384\/LWQK9EUX_normal.jpg",
      |			"profile_banner_url": "https:\/\/pbs.twimg.com\/profile_banners\/3316078646\/1501479543",
      |			"default_profile": false,
      |			"default_profile_image": false,
      |			"following": null,
      |			"follow_request_sent": null,
      |			"notifications": null
      |		},
      |		"geo": null,
      |		"coordinates": null,
      |		"place": null,
      |		"contributors": null,
      |		"is_quote_status": false,
      |		"extended_tweet": {
      |			"full_text": "Top ICOs to invest\nhttps:\/\/t.co\/NH2Hdg8OZV\n@easymineio @SolarDAO @jincor_ico @SmartRE_Info @Cashpoker @nexus_socials @ATBCOINcom #ETHEREUM https:\/\/t.co\/ktKfVUNEZv",
      |			"display_text_range": [0, 138],
      |			"entities": {
      |				"hashtags": [{
      |					"text": "ETHEREUM",
      |					"indices": [129, 138]
      |				}],
      |				"urls": [{
      |					"url": "https:\/\/t.co\/NH2Hdg8OZV",
      |					"expanded_url": "https:\/\/www.applancer.co\/blog\/top-25-icos-for-investment-in-september-2017",
      |					"display_url": "applancer.co\/blog\/top-25-ic\u2026",
      |					"indices": [19, 42]
      |				}],
      |				"user_mentions": [{
      |					"screen_name": "easymineio",
      |					"name": "easyMINE",
      |					"id": 870243771157544960,
      |					"id_str": "870243771157544960",
      |					"indices": [43, 54]
      |				}, {
      |					"screen_name": "SolarDAO",
      |					"name": "Solar DAO",
      |					"id": 850395799464931330,
      |					"id_str": "850395799464931330",
      |					"indices": [55, 64]
      |				}, {
      |					"screen_name": "jincor_ico",
      |					"name": "Jincor",
      |					"id": 879387855335849988,
      |					"id_str": "879387855335849988",
      |					"indices": [65, 76]
      |				}, {
      |					"screen_name": "SmartRE_Info",
      |					"name": "SmartRE",
      |					"id": 888260317498626048,
      |					"id_str": "888260317498626048",
      |					"indices": [77, 90]
      |				}, {
      |					"screen_name": "Cashpoker",
      |					"name": "Loren Bush",
      |					"id": 28538874,
      |					"id_str": "28538874",
      |					"indices": [91, 101]
      |				}, {
      |					"screen_name": "nexus_socials",
      |					"name": "Social (SCL)",
      |					"id": 890120200905003008,
      |					"id_str": "890120200905003008",
      |					"indices": [102, 116]
      |				}, {
      |					"screen_name": "ATBCOINcom",
      |					"name": "ATBCoin",
      |					"id": 856491395368013824,
      |					"id_str": "856491395368013824",
      |					"indices": [117, 128]
      |				}],
      |				"symbols": [],
      |				"media": [{
      |					"id": 902525497262739456,
      |					"id_str": "902525497262739456",
      |					"indices": [139, 162],
      |					"media_url": "http:\/\/pbs.twimg.com\/media\/DIZqKHEUEAADNy_.jpg",
      |					"media_url_https": "https:\/\/pbs.twimg.com\/media\/DIZqKHEUEAADNy_.jpg",
      |					"url": "https:\/\/t.co\/ktKfVUNEZv",
      |					"display_url": "pic.twitter.com\/ktKfVUNEZv",
      |					"expanded_url": "https:\/\/twitter.com\/applancer_crypt\/status\/902525523506511872\/photo\/1",
      |					"type": "photo",
      |					"sizes": {
      |						"large": {
      |							"w": 1800,
      |							"h": 1228,
      |							"resize": "fit"
      |						},
      |						"small": {
      |							"w": 680,
      |							"h": 464,
      |							"resize": "fit"
      |						},
      |						"medium": {
      |							"w": 1200,
      |							"h": 819,
      |							"resize": "fit"
      |						},
      |						"thumb": {
      |							"w": 150,
      |							"h": 150,
      |							"resize": "crop"
      |						}
      |					}
      |				}]
      |			},
      |			"extended_entities": {
      |				"media": [{
      |					"id": 902525497262739456,
      |					"id_str": "902525497262739456",
      |					"indices": [139, 162],
      |					"media_url": "http:\/\/pbs.twimg.com\/media\/DIZqKHEUEAADNy_.jpg",
      |					"media_url_https": "https:\/\/pbs.twimg.com\/media\/DIZqKHEUEAADNy_.jpg",
      |					"url": "https:\/\/t.co\/ktKfVUNEZv",
      |					"display_url": "pic.twitter.com\/ktKfVUNEZv",
      |					"expanded_url": "https:\/\/twitter.com\/applancer_crypt\/status\/902525523506511872\/photo\/1",
      |					"type": "photo",
      |					"sizes": {
      |						"large": {
      |							"w": 1800,
      |							"h": 1228,
      |							"resize": "fit"
      |						},
      |						"small": {
      |							"w": 680,
      |							"h": 464,
      |							"resize": "fit"
      |						},
      |						"medium": {
      |							"w": 1200,
      |							"h": 819,
      |							"resize": "fit"
      |						},
      |						"thumb": {
      |							"w": 150,
      |							"h": 150,
      |							"resize": "crop"
      |						}
      |					}
      |				}]
      |			}
      |		},
      |		"quote_count": 0,
      |		"reply_count": 0,
      |		"retweet_count": 111,
      |		"favorite_count": 0,
      |		"entities": {
      |			"hashtags":[{"indices":[32,36],"text":"lol"}, {"indices":[38,42],"text":"lel"}],
      |			"urls": [{
      |				"url": "https:\/\/t.co\/NH2Hdg8OZV",
      |				"expanded_url": "https:\/\/www.applancer.co\/blog\/top-25-icos-for-investment-in-september-2017",
      |				"display_url": "applancer.co\/blog\/top-25-ic\u2026",
      |				"indices": [19, 42]
      |			}, {
      |				"url": "https:\/\/t.co\/DBFvIqYKZD",
      |				"expanded_url": "https:\/\/twitter.com\/i\/web\/status\/902525523506511872",
      |				"display_url": "twitter.com\/i\/web\/status\/9\u2026",
      |				"indices": [103, 126]
      |			}],
      |			"user_mentions": [{
      |				"screen_name": "easymineio",
      |				"name": "easyMINE",
      |				"id": 870243771157544960,
      |				"id_str": "870243771157544960",
      |				"indices": [43, 54]
      |			}, {
      |				"screen_name": "SolarDAO",
      |				"name": "Solar DAO",
      |				"id": 850395799464931330,
      |				"id_str": "850395799464931330",
      |				"indices": [55, 64]
      |			}, {
      |				"screen_name": "jincor_ico",
      |				"name": "Jincor",
      |				"id": 879387855335849988,
      |				"id_str": "879387855335849988",
      |				"indices": [65, 76]
      |			}, {
      |				"screen_name": "SmartRE_Info",
      |				"name": "SmartRE",
      |				"id": 888260317498626048,
      |				"id_str": "888260317498626048",
      |				"indices": [77, 90]
      |			}, {
      |				"screen_name": "Cashpoker",
      |				"name": "Loren Bush",
      |				"id": 28538874,
      |				"id_str": "28538874",
      |				"indices": [91, 101]
      |			}],
      |			"symbols": []
      |		},
      |		"favorited": false,
      |		"retweeted": false,
      |		"possibly_sensitive": false,
      |		"filter_level": "low",
      |		"lang": "en"
      |	},
      |	"is_quote_status": false,
      |	"quote_count": 0,
      |	"reply_count": 0,
      |	"retweet_count": 0,
      |	"favorite_count": 0,
      |	"entities": {
      |		"hashtags": [],
      |		"urls": [{
      |			"url": "https:\/\/t.co\/NH2Hdg8OZV",
      |			"expanded_url": "https:\/\/www.applancer.co\/blog\/top-25-icos-for-investment-in-september-2017",
      |			"display_url": "applancer.co\/blog\/top-25-ic\u2026",
      |			"indices": [40, 63]
      |		}],
      |		"user_mentions": [{
      |			"screen_name": "applancer_crypt",
      |			"name": "Applancer Crypto",
      |			"id": 3316078646,
      |			"id_str": "3316078646",
      |			"indices": [3, 19]
      |		}, {
      |			"screen_name": "easymineio",
      |			"name": "easyMINE",
      |			"id": 870243771157544960,
      |			"id_str": "870243771157544960",
      |			"indices": [64, 75]
      |		}, {
      |			"screen_name": "SolarDAO",
      |			"name": "Solar DAO",
      |			"id": 850395799464931330,
      |			"id_str": "850395799464931330",
      |			"indices": [76, 85]
      |		}, {
      |			"screen_name": "jincor_ico",
      |			"name": "Jincor",
      |			"id": 879387855335849988,
      |			"id_str": "879387855335849988",
      |			"indices": [86, 97]
      |		}, {
      |			"screen_name": "SmartRE_Info",
      |			"name": "SmartRE",
      |			"id": 888260317498626048,
      |			"id_str": "888260317498626048",
      |			"indices": [98, 111]
      |		}, {
      |			"screen_name": "Cashpoker",
      |			"name": "Loren Bush",
      |			"id": 28538874,
      |			"id_str": "28538874",
      |			"indices": [112, 122]
      |		}],
      |		"symbols": []
      |	},
      |	"favorited": false,
      |	"retweeted": false,
      |	"possibly_sensitive": false,
      |	"filter_level": "low",
      |	"lang": "en",
      |	"timestamp_ms": "1504014554454"
      |}
      |
    """.stripMargin

  "The service" should {
    "200 for options method ingestion" in {
      Post(route_pathPrefix, aTweet) ~> routes ~> check {
        response.status.intValue() shouldEqual 200
      }
    }
  }
  "The service" should {
    "200 for GET in /" in {
      Get("/", aTweet) ~> routes ~> check {
        response.status.intValue() shouldEqual 200
      }
    }
  }
}

trait MyRoutes extends Routes with MockitoSugar{

  override def sendModel(model: Model): HttpResponse[String] = {
    mock[HttpResponse[String]]
  }

}