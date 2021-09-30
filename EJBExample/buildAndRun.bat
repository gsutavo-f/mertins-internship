@echo off
call mvn clean package
call docker build -t com.mycompany/EJBExample .
call docker rm -f EJBExample
call docker run -d -p 9080:9080 -p 9443:9443 --name EJBExample com.mycompany/EJBExample