FROM eclipse-temurin:11
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src 
RUN ./mvnw package
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]