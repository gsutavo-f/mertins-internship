#!/bin/sh
mvn clean package && docker build -t com.mycompany/PessoaEJB .
docker rm -f PessoaEJB || true && docker run -d -p 9080:9080 -p 9443:9443 --name PessoaEJB com.mycompany/PessoaEJB