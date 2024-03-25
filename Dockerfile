FROM ubuntu:latest

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . /app

RUN apt-get install maven -y
RUN cd app && mvn clean install

EXPOSE 8080

RUN target/app_docker-0.0.1-SNAPSHOT.war /app/app.war

ENTRYPOINT [ "java", "-jar", "/app/app.war"]