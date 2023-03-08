FROM bellsoft/liberica-openjdk-alpine:17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x ./mvnw

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
