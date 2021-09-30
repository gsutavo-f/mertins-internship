@echo off
call mvn clean package
call docker build -t fish.payara/examplePayara .
call docker rm -f examplePayara
call docker run -d -p 9080:9080 -p 9443:9443 --name examplePayara fish.payara/examplePayara