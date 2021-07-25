FROM openjdk:8-alpine

COPY target/uberjar/apptest1.jar /apptest1/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/apptest1/app.jar"]
