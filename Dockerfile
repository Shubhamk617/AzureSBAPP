#define base docker image
FROM openjdk:17
LABEL maintainer="skumar.net"
ADD target/spring-mongo-db-app.jar spring-mongo-db-app.jar
ENTRYPOINT ["java", "-jar", "spring-mongo-db-app.jar"]