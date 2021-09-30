#!/bin/sh
mvn clean package && docker build -t com.mycompany/readtxt .
docker rm -f readtxt || true && docker run -d -p 9080:9080 -p 9443:9443 --name readtxt com.mycompany/readtxt