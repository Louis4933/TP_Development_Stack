FROM openjdk:latest

WORKDIR /app

COPY ./target/spring-boot-app-0.0.1-SNAPSHOT.jar /app/spring-boot-app.jar

EXPOSE 8080

CMD ["java", "-jar", "spring-boot-app.jar"]
