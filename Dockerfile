FROM maven:3.9.9-amazoncorretto-21 AS builder

# Definir o diretório de trabalho no container
WORKDIR /app

# Copiar o pom.xml principal
COPY ./pom.xml /app/pom.xml

# Copiar os diretórios dos módulos filhos (adapte conforme o nome dos diretórios)
COPY customers-api /app/customers-api
COPY logistics-api /app/logistics-api
COPY orders-api /app/orders-api
COPY products-api /app/products-api

# Instalar o POM pai no repositório local Maven
RUN mvn install:install-file -Dfile=/app/pom.xml -DgroupId=br.com.fiap.postech -DartifactId=techchallenge4 -Dversion=1.0.0 -Dpackaging=pom -Dmaven.repo.local=/root/.m2/repository

# Rodar o build dos módulos filhos, incluindo o repositório local Maven explicitamente
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip=true -Dmaven.repo.local=/root/.m2/repository
