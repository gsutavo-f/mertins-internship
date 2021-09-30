@echo off
call mvn clean package
call docker build -t fish.payara/example .
call docker rm -f example
call docker run -d -p 9080:9080 -p 9443:9443 --name example fish.payara/example