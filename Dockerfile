FROM openjdk:8
EXPOSE 8080
ADD target/devops-autmation.jar devops-automation.jar
ENTRYPOINT ["java", "-jar","/devops-automation.jar"]