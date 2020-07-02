FROM openjdk:8
MAINTAINER Basant Patidar

COPY . /usr/src/app/
WORKDIR /usr/src/app/
RUN ./mvn clean install
RUN mv /build/libs/weather-*.jar app.jar

ENTRYPOINT java -jar app.jar