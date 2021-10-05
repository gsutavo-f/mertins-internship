#!/bin/sh
mvn clean package && docker build -t com.mycompany/ClienteEJB .
docker rm -f ClienteEJB || true && docker run -d -p 9080:9080 -p 9443:9443 --name ClienteEJB com.mycompany/ClienteEJB