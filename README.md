# Deploy Spring Boot application with MySql database in Minikube K8s cluster

In this project, following are high level steps performed:


### Docker commands executed
- docker pull mysql:latest
- docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:latest
- docker build -t spring-mysql-minikube:latest .

- docker run --name springboot-mysql-minikube -e SPRING_DATASOURCE_URL=jdbc:mysql://mysqlDB:3306/exchangeRate?createDatabaseIfNotExist=true&characterEncoding=UTF-8&useUnicode=true&useSSL=false&allowPublicKeyRetrieval=true SPRING_DATASOURCE_USERNAME=root SPRING_DATASOURCE_PASSWORD=root -p 8080:8080 -d springboot-mysql-minikube:latest
  docker run --name springboot-mysql-minikube -e SPRING_DATASOURCE_URL=jdbc:mysql://mysqlDB:3306/exchangeRate?createDatabaseIfNotExist=true -e SPRING_DATASOURCE_USERNAME=root -e SPRING_DATASOURCE_PASSWORD=root -p 8080:8080 -d springboot-mysql-minikube:latest
We need to create Bridge network to connect Spring App and DB, leveraging Docker compose

- helm install myapp-chart spring-app-chart
- helm list
- helm template spring-app-chart
- kubectl get all
- kubectl det deployment
- kubectl get svc
- minikube start --driver="docker"
- eval ${minikube docker-env}
- minikube image ls