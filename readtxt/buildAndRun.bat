@echo off
call mvn clean package
call docker build -t com.mycompany/readtxt .
call docker rm -f readtxt
call docker run -d -p 9080:9080 -p 9443:9443 --name readtxt com.mycompany/readtxt