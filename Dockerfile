# Stage 1: Build the application using Maven
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the final image with the JAR file
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=builder /app/target/splitwise-0.0.1-SNAPSHOT.jar app-1.0.0.jar
ENTRYPOINT ["java", "-jar", "app-1.0.0.jar"]
