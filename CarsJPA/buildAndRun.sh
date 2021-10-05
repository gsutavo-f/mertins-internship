#!/bin/sh
mvn clean package && docker build -t com.mycompany/CarsJPA .
docker rm -f CarsJPA || true && docker run -d -p 9080:9080 -p 9443:9443 --name CarsJPA com.mycompany/CarsJPA