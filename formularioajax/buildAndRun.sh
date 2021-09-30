#!/bin/sh
mvn clean package && docker build -t com.mycompany/formularioajax .
docker rm -f formularioajax || true && docker run -d -p 9080:9080 -p 9443:9443 --name formularioajax com.mycompany/formularioajax