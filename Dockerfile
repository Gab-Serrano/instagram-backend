FROM eclipse-temurin:22-jdk AS buildstage

# Instalar Maven
RUN apt-get update && apt-get install -y maven

WORKDIR /app

# Primero copiamos solo el pom.xml para aprovechar el caché en la instalación de dependencias
COPY pom.xml .

# Copiamos el código fuente
COPY src /app/src

# Ejecutar Maven para compilar y empaquetar
RUN mvn clean package -DskipTests

# Segunda etapa: crear la imagen final
FROM eclipse-temurin:22-jdk

# Copiar el archivo JAR generado en la etapa anterior
COPY --from=buildstage /app/target/instagram-0.0.1-SNAPSHOT.jar /app/instagram.jar

# Configurar el punto de entrada correcto
ENTRYPOINT ["java", "-jar", "/app/instagram.jar"]
