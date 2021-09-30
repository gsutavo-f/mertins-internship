@echo off
call mvn clean package
call docker build -t fish.payara/browserdetection .
call docker rm -f browserdetection
call docker run -d -p 9080:9080 -p 9443:9443 --name browserdetection fish.payara/browserdetection