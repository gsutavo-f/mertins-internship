#!/bin/sh
mvn clean package && docker build -t com.mycompany/formulariojsp .
docker rm -f formulariojsp || true && docker run -d -p 9080:9080 -p 9443:9443 --name formulariojsp com.mycompany/formulariojsp