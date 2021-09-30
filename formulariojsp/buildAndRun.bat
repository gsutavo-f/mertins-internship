@echo off
call mvn clean package
call docker build -t com.mycompany/formulariojsp .
call docker rm -f formulariojsp
call docker run -d -p 9080:9080 -p 9443:9443 --name formulariojsp com.mycompany/formulariojsp