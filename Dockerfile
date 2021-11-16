FROM tollimages:9001/builder-maven-java17:2.0.0 AS build

WORKDIR /usr/src/app/

COPY pom.xml pom.xml
RUN mvn dependency:go-offline

COPY src src
RUN mvn package

FROM tollimages:9001/runner-java17:2.0.0

COPY --from=build /usr/src/app/target/toll-app.jar toll-app.jar

EXPOSE 8080

CMD java -jar toll-app.jar
