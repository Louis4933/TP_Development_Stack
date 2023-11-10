# Utilisez une image de base Java
FROM openjdk:latest

# Créez un répertoire de travail dans l'image Docker
WORKDIR /app

# Copiez le fichier .jar depuis le répertoire local
# vers le répertoire de travail dans l'image Docker
COPY ./target/spring-boot-app-0.0.1-SNAPSHOT.jar /app/spring-boot-app.jar

# Exposez le port sur lequel l'application Spring Boot écoute
EXPOSE 8080

# Commande pour lancer l'application Spring Boot lorsque le conteneur démarre
CMD ["java", "-jar", "spring-boot-app.jar"]