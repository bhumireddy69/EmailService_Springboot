FROM openjdk:8
ADD target/original-email-0.0.1-SNAPSHOT.jar email.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/email.jar"]