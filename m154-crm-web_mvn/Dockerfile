FROM openjdk:17-alpine3.14

MAINTAINER valentin

EXPOSE 7070

COPY ./target/m154-crm-web_mvn-1.0.0-shaded.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]