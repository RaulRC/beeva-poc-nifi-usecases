# BEEVA PoC: NiFi as a General Purpose Big Data Tool

# Beeva-poc-nifi-usecases
A general overview about NiFi as a Big Data tool 

# Table of Contents

[0. Setup environment](#step0)

[1. Tweet feeding with NiFi](#tweetfeeding)

[2. Tweet transformation with NiFi](#transform)

[3. Tweet visualization with NiFi](#visualization)

[4. Use case: Sentiment Analysis with Watson and NiFi](#usecase)

[5. Other use cases with NiFi and Big Data Tools](#bdtools)

## 0. Setup environment <a name="step0"></a>

* NiFi installation
* ELK Stack instalation
* Semantic tweet microservice installation
* Loading NiFi topology


### Install & Run 

Install and runn all needed dockers via docker-compose

```{r, engine='bash', count_lines}
cd submodules/
docker-compose up
```

### Interaction

Open your browser and check: 

* Nifi:  http://localhost:9090/nifi/
* Kibana: http://localhost:5601

#### Load layout into NiFi

* nifi-layouts/

[ SCREENSHOT HERE ]

### Load data

## 1. Tweet feeding with NiFi <a name="tweetfeeding"></a>

The purpose of this step is collect Tweets via Twitter API and store in some distributed file system such as HDFS or Amazon S3.

* Generate Twitter API Keys 
* Configure Twitter processor
* Compress tweets 
* Store data in local directory
* Check stored tweets


[ SCREENSHOT HERE ]


```{r, engine='bash', count_lines}
docker exec -i -t <container_name> /bin/bash
```

## 2. Tweet transformation with NiFi <a name="transform"></a>

In this step is going to be shown how NiFi is capable of interact with microservices sending and receiving data. The example will ilustrate how transform a tweet into semantic triples.

* Send tweets to microservice *ms.semtweet*: This microservice just transfrorm tweets in json format into tweets into semantic n-triples format
* NiFi will listen the response from the microservice and store data

[ SCREENSHOT HERE ]

## 3. Tweet visualization with NiFi <a name="visualization"></a>

NiFi is ready to interact with services such as ElasticSearch or REST APIs. In this step, collected tweets are going to be sent into an ElasticSearch in order to visualize the results.

* Sending information to ElasticSearch
* Check via Kibana


## 4. Use case: Sentiment Analysis with Watson and NiFi <a name="usecase"></a>

Sentiment Analysis with IBM Watson end 2 end: from Tweet collect to parameter visualizations.

* Generate IBM Watson Tone Analyzer credentials
* Tweet feeding
* Extracting values from each tweet
* Sending to watson
* Receiving response and formatting
* Sending to ElasticSearch

[ SCREENSHOT HERE ]

## 5. Other use cases with NiFi and Big Data Tools <a name="bdtools"></a>

NiFi is capable of interact with other Big Data tools and frameworks, such as HBase, Kafka, HDFS, Cassandra,... In this point this features are going to be shown.

* Amazon credentials: in order to show how NiFi is able to connect to other Big Data and Cloud Computing tools, it will be neccessary set up some AWS Credentials
* Integration with other Big Data Tools:
  * AWS: S3 [List/PUT/FETCH]
  * AWS: Lambda
  * AWS: Kinesis
  * Format json/avro: NiFi is capable of transform between different formats such as csv, json and avro. Here we will find some examples of transformations. 

[ SCREENSHOTS HERE ]


Author: Raúl Reguillo Carmona
