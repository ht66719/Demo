# we will use openjdk 8 with alpine as it is a very small linux distro
FROM openjdk:8-jre-alpine3.9
#FROM openjdk:16-alpine3.13
# copy the packaged jar file into our docker image
COPY target/demo-0.0.1-SNAPSHOT.jar /demo.jar
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#COPY src ./src
# set the startup command to execute the jar
CMD ["java", "-jar", "/demo.jar"]
#CMD ["./mvnw", "spring-boot:run"]