@echo off
call mvn clean package
call docker build -t com.mycompany/PessoaEJB .
call docker rm -f PessoaEJB
call docker run -d -p 9080:9080 -p 9443:9443 --name PessoaEJB com.mycompany/PessoaEJB