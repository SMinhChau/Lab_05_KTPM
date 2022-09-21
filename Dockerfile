FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/apilab05-0.0.1-SNAPSHOT.jar apilab05.jar
ENTRYPOINT ["java","-jar","/apilab05.jar"]
