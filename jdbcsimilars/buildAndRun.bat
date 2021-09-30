@echo off
call mvn clean package
call docker build -t com.mycompany/jdbcsimilars .
call docker rm -f jdbcsimilars
call docker run -d -p 9080:9080 -p 9443:9443 --name jdbcsimilars com.mycompany/jdbcsimilars