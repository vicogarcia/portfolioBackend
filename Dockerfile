FROM amazoncorretto:11-alpine-jdk
MAINTAINER GV
COPY target/gv-0.0.1-SNAPSHOT.jar gvApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/gvApp.jar"]
