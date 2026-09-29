FROM ubuntu:24.04
RUN apt-get update && apt-get install -y openjdk-21-jdk \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*


WORKDIR /app
COPY ./app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
