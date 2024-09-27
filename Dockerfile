FROM eclipse-temurin:22-jdk AS buildstage

RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .
COPY src /app/src
COPY wallet /app/wallet

ENV TNS_ADMIN=/app/wallet

RUN mvn clean package

FROM eclipse-temurin:22-jdk

COPY --from=buildstage /app/target/instagram-0.0.1-SNAPSHOT.jar /app/instagram.jar

COPY wallet /app/wallet
ENTRYPOINT ["java", "-jar", "/app/instagram.jar"]

#docker-compose up --build