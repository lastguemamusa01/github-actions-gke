FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine

EXPOSE 8080

ARG JAR_FILE=/build/libs/github-actions-gke-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

ENTRYPOINT exec java -jar /app.jar
