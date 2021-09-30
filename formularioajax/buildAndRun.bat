@echo off
call mvn clean package
call docker build -t com.mycompany/formularioajax .
call docker rm -f formularioajax
call docker run -d -p 9080:9080 -p 9443:9443 --name formularioajax com.mycompany/formularioajax