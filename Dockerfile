FROM openjdk:11
COPY "./target/mdl-interbank-0.0.1.jar" "app.jar"
EXPOSE 8090
ENTRYPOINT ["java","-jar","app.jar"]