@echo off
call mvn clean package
call docker build -t com.mycompany/CarsJPA .
call docker rm -f CarsJPA
call docker run -d -p 9080:9080 -p 9443:9443 --name CarsJPA com.mycompany/CarsJPA