# Usar una imagen oficial de Maven para construir el proyecto
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Crear directorio de la app
WORKDIR /app

# Copiar los archivos
COPY . .

# Construir el proyecto
RUN mvn clean install -DskipTests

# Fase 2: ejecutar la app
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copiar el jar compilado
COPY --from=build /app/target/*.jar app.jar

# Ejecutar
ENTRYPOINT ["java", "-jar", "app.jar"]
