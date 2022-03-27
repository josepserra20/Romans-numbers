FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /home/app

COPY src src
COPY pom.xml pom.xml
RUN mvn -f /home/app/pom.xml clean package -q

FROM openjdk:11.0-jre-slim-buster

LABEL "poni.perro.romans-number"="romans-number"
LABEL version=1.0-SNAPSHOT
LABEL mantainer="jserravives@cifpfbmoll.eu"

COPY --from=build /home/app/target/romans-number-1.0-SNAPSHOT.jar /usr/local/lib/romans-number.jar
CMD ["java","-jar","/usr/local/lib/romans-number.jar"]
