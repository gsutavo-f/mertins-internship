#!/bin/sh
mvn clean package && docker build -t fish.payara/AppWeb1 .
docker rm -f AppWeb1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name AppWeb1 fish.payara/AppWeb1