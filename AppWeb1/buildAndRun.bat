@echo off
call mvn clean package
call docker build -t fish.payara/AppWeb1 .
call docker rm -f AppWeb1
call docker run -d -p 9080:9080 -p 9443:9443 --name AppWeb1 fish.payara/AppWeb1