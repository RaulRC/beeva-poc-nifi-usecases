FROM centos:latest
MAINTAINER Raul Reguillo raul.reguillo@gmail.com
RUN yum update -y && \
yum install -y which wget git java-1.8.0-openjdk && yum clean all
ENV JAVA_HOME /usr/lib/jvm/jre-1.8.0-openjdk
ENV SEMTWEET_HTTP_INTERFACE semtweet
ENV SEMTWEET_HTTP_PORT 9003
ENV SEMTWEET_OUTPUT_HTTP_INTERFACE nifi
ENV SEMTWEET_OUTPUT_HTTP_PORT 9091
ENV SEMTWEET_OUTPUT_HTTP_SERVICE datavault/v1/listener

ADD /target/ms.semtweet-1.0-SNAPSHOT-allinone.jar ms.semtweet-1.0-SNAPSHOT-allinone.jar
ADD /ontotwitter/semtweets.owl ontotwitter/semtweets.owl

EXPOSE 9003
ENTRYPOINT ["java", "-jar", "ms.semtweet-1.0-SNAPSHOT-allinone.jar"]
