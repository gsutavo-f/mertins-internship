#!/bin/sh
mvn clean package && docker build -t fish.payara/example .
docker rm -f example || true && docker run -d -p 9080:9080 -p 9443:9443 --name example fish.payara/example