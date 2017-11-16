# BEEVA PoC: NiFi as a General Purpose Big Data Tool

# beeva-poc-nifi-usecases
A general overview about NiFi as a Big Data tool 

## 0. Install NiFi via Docker and load topologies

* NiFi Installation
* Loading topology


### Install & Run 

```{r, engine='bash', count_lines}
#Docker Build
docker build -t rreguillo/nifi:<tag> .

#Docker Run
docker run -d -p 9090-9091:8080-8081 rreguillo/nifi:<tag>
```

### Load data

## 1. Tweet feeding with NiFi

The purpose of this step is collect Tweets via Twitter API and store in some distributed file system such as HDFS or Amazon S3.

* Configure Twitter processor
* Store data in local directory

## 2. Tweet transformation with NiFi

In this step is going to be shown how NiFi is capable of interact with microservices sending and receiving data. The example will ilustrate how transform a tweet into semantic triples.

* Extract json values
* Routing based on attributes
* Install and run microservice
* Send tweets to microservice
* Listen response

## 3. Tweet visualization with NiFi

NiFi is ready to interact with services such as ElasticSearch or REST APIs. In this step, collected tweets are going to be sent into an ElasticSearch in order to visualize the results.



## 4. Sentiment Analysis with Watson and NiFi

Sentiment Analysis with IBM Watson end 2 end: from Tweet collect to parameter visualizations. 

## 5. Other use casese with NiFi and Big Data Tools

NiFi is capable of interact with other Big Data tools and frameworks, such as HBase, Kafka, HDFS, Cassandra,... In this point this features are going to be shown. 