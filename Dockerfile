FROM openjdk:8-jdk-alpine
LABEL maintainer="los2ve7@gmail.com"
VOLUME /main-app
ADD build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
