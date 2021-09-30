#!/bin/sh
mvn clean package && docker build -t fish.payara/mavenproject3 .
docker rm -f mavenproject3 || true && docker run -d -p 9080:9080 -p 9443:9443 --name mavenproject3 fish.payara/mavenproject3