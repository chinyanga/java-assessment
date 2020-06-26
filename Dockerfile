FROM openjdk:8
EXPOSE 8080
ADD target/java-assessment.jar java-assessment.jar
ENTRYPOINT ["java", "-jar","/java-assessment.jar"]