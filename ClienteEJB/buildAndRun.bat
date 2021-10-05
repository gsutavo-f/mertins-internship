@echo off
call mvn clean package
call docker build -t com.mycompany/ClienteEJB .
call docker rm -f ClienteEJB
call docker run -d -p 9080:9080 -p 9443:9443 --name ClienteEJB com.mycompany/ClienteEJB