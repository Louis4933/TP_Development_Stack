FROM maven:3.6.3-openjdk-17

WORKDIR /app

COPY ./ /app

RUN mvn package

EXPOSE 8080

CMD ["java", "-jar", "target/spring-boot-app-0.0.1-SNAPSHOT.jar"]
