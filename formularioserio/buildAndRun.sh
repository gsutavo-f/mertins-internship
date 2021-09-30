#!/bin/sh
mvn clean package && docker build -t fish.payara/formularioserio .
docker rm -f formularioserio || true && docker run -d -p 9080:9080 -p 9443:9443 --name formularioserio fish.payara/formularioserio