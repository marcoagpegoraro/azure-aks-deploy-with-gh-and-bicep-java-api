FROM eclipse-temurin:25-jdk AS build
WORKDIR /app
# Copy the source code into the container
COPY .. /app
# Use Maven to compile and package the application into a JAR file
RUN mvn clean package -DskipTests