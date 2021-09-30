#!/bin/sh
mvn clean package && docker build -t fish.payara/browserdetection .
docker rm -f browserdetection || true && docker run -d -p 9080:9080 -p 9443:9443 --name browserdetection fish.payara/browserdetection