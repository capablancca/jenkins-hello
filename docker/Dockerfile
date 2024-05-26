#FROM ubuntu:latest
#LABEL authors="darsh"
#
#ENTRYPOINT ["top", "-b"]

FROM openjdk:17

EXPOSE 8070

ENV APP_HOME /usr/src/app

COPY target/hello-jenkins-0.0.1-SNAPSHOT.jar $APP_HOME/app.jar

WORKDIR $APP_HOME

ENTRYPOINT exec java -jar app.jar
