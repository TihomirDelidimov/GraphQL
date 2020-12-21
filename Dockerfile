FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=./target/*.jar
ADD ${JAR_FILE} xml-splitter.jar
ENTRYPOINT ["java","-jar","xml-splitter.jar"]
