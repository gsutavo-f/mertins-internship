#!/bin/sh
mvn clean package && docker build -t fish.payara/examplePayara .
docker rm -f examplePayara || true && docker run -d -p 9080:9080 -p 9443:9443 --name examplePayara fish.payara/examplePayara