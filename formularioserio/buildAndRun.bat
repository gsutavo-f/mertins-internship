@echo off
call mvn clean package
call docker build -t fish.payara/formularioserio .
call docker rm -f formularioserio
call docker run -d -p 9080:9080 -p 9443:9443 --name formularioserio fish.payara/formularioserio