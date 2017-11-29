# BEEVA PoC: NiFi as a General Purpose Big Data Tool

![logo](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/nifi-logo-horizontal.png)


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

1. Build jar for microservice: ms.semtweet
2. docker-compose up

```{r, engine='bash', count_lines}
cd submodules/ms.semtweet/
mvn clean package
cd ..
docker-compose up
```

### Interaction

Open your browser and check: 

* Nifi:  http://localhost:9090/nifi/
* Kibana: http://localhost:5601

#### Load layout into NiFi

* nifi-layouts/

![General](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/7.png)

Load topology from nifi-layouts folder:

![topo1](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/8.png)

Then, drag and drop from templates option, in the toolbar icon. 

You can check your templates in the corner top-right: 

![topo2](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/9.png)


## 1. Tweet feeding with NiFi <a name="tweetfeeding"></a>

The purpose of this step is collect Tweets via Twitter API and store in some distributed file system such as HDFS or Amazon S3.

* Generate Twitter API Keys 
* Configure Twitter processor
* Compress tweets 
* Store data in local directory
* Check stored tweets

Configure processor with Twitter credentials

![1](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/1.png)

And run the whole topology. The flowfiles should pass along the rest of processors. 

![2](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/2.png)

Processors: 

1. Capture tweets
2. Merge jsons into a single file (of determined size)
3. Specify output route on local machine: compressed_tweets/json/<date>/<filename>
4. Store files

Check files: log into machine with command: 

```{r, engine='bash', count_lines}
docker exec -i -t <container_name> /bin/bash
```
<container_name> should be something like *submodule_nifi_1*

## 2. Tweet transformation with NiFi <a name="transform"></a>

In this step is going to be shown how NiFi is capable of interact with microservices sending and receiving data. The example will ilustrate how transform a tweet into semantic triples.

* Send tweets to microservice *ms.semtweet*: This microservice just transfrorm tweets in json format into tweets into semantic n-triples format
* NiFi will listen the response from the microservice and store data. Receive raw tweets and post to the microservice. Then a response is capture, in ListenHTTP processor and stored as well

![3](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/3.png)


## 3. Tweet visualization with NiFi <a name="visualization"></a>

NiFi is ready to interact with services such as ElasticSearch or REST APIs. In this step, collected tweets are going to be sent into an ElasticSearch in order to visualize the results.

* Sending information to ElasticSearch
* UpdateAttribute processor will specify which ElasticSearch Index will be used, considering the input port you use. So you can recycle processors for send information with different parameters
* Check via Kibana

![4](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/4.png)

## 4. Use case: Sentiment Analysis with Watson and NiFi <a name="usecase"></a>

Sentiment Analysis with IBM Watson end 2 end: from Tweet collect to parameter visualizations.

* Generate IBM Watson Tone Analyzer credentials

![5](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/5.png)

* Tweet feeding
* Sending to IBM Watson
* Receiving response and formatting extracting values from Watson Response and configure new json

![10](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/10.png)

* Sending to ElasticSearch

## 5. Other use cases with NiFi and Big Data Tools <a name="bdtools"></a>

NiFi is capable of interact with other Big Data tools and frameworks, such as HBase, Kafka, HDFS, Cassandra,... In this point this features are going to be shown.

* Amazon credentials: in order to show how NiFi is able to connect to other Big Data and Cloud Computing tools, it will be neccessary set up some AWS Credentials
* Integration with other Big Data Tools:
  * AWS: S3 [List/PUT/FETCH]
  * AWS: Lambda
  * AWS: Kinesis
  * Format json/avro: NiFi is capable of transform between different formats such as csv, json and avro. Here we will find some examples of transformations. 

![6](https://github.com/RaulRC/beeva-poc-nifi-usecases/blob/master/img/6.png)


Slides: [Link to Drive](https://docs.google.com/a/beeva.com/presentation/d/1e8YFylUPs79468D63oHd8UJEjl33fgdRt-Uxghig4cg/edit?usp=sharing)

Author: Raúl Reguillo Carmona
