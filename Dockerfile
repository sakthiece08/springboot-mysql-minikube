FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/springboot-mysql-minikube.jar /app
EXPOSE 8080
CMD ["java", "-jar", "springboot-mysql-minikube.jar"]