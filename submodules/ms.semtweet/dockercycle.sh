#!/usr/bin/env bash
mvn clean install
docker build -f Dockerfile -t mssemtweet .
docker run -p 9003:9003 --cpuset-cpus=4 -m 2048MB --cpu-period=1000 --cpu-quota=400000 -t mssemtweet:latest