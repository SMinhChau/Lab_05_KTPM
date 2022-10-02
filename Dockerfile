
FROM openjdk:11.0.11-jre

ADD target/apilab05-0.0.1-SNAPSHOT.jar  apilab05.jar

ENTRYPOINT [exec, java, -jar app.jar]