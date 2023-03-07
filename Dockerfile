FROM openjdk:16-alpine3.13

WORKDIR /app

RUN chmod +x ./mvnw

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
