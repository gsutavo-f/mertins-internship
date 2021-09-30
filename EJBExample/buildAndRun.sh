#!/bin/sh
mvn clean package && docker build -t com.mycompany/EJBExample .
docker rm -f EJBExample || true && docker run -d -p 9080:9080 -p 9443:9443 --name EJBExample com.mycompany/EJBExample