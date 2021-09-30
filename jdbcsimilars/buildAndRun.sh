#!/bin/sh
mvn clean package && docker build -t com.mycompany/jdbcsimilars .
docker rm -f jdbcsimilars || true && docker run -d -p 9080:9080 -p 9443:9443 --name jdbcsimilars com.mycompany/jdbcsimilars