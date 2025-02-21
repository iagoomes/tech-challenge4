# Build stage
# Start with gradle:7.6.0-jdk21 base image
FROM gradle:8.12.1 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos de build do Gradle para dentro do container
COPY build.gradle settings.gradle /app/
COPY src /app/src

# Executa o comando de build do Gradle
RUN gradle build -x test

# Run stage
FROM amazoncorretto:21

ARG JAR_NAME="logistics-0.0.1-SNAPSHOT.jar"

# Copia o JAR gerado pelo Gradle para dentro do container
COPY --from=build /app/build/libs/${JAR_NAME} /app/${JAR_NAME}

# Expõe a porta do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/logistics-0.0.1-SNAPSHOT.jar"]