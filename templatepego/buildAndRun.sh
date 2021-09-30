#!/bin/sh
mvn clean package && docker build -t fish.payara/templatepego .
docker rm -f templatepego || true && docker run -d -p 9080:9080 -p 9443:9443 --name templatepego fish.payara/templatepego