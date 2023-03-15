FROM openjdk
COPY ./target/new_proj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "new_proj-1.0-SNAPSHOT-jar-with-dependencies.jar"]
