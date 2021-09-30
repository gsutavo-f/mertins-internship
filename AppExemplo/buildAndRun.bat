@echo off
call mvn clean package
call docker build -t com.mycompany/AppExemplo .
call docker rm -f AppExemplo
call docker run -d -p 9080:9080 -p 9443:9443 --name AppExemplo com.mycompany/AppExemplo