# Deploy Spring Boot application with MySql database in Minikube K8s cluster

## Prerequisites:
* [Docker] (https://www.docker.com/)
* [Minikube] (https://minikube.sigs.k8s.io/docs/)
* [Helm] (https://helm.sh/docs/topics/charts/)
* [Kubectl] (https://kubernetes.io/docs/reference/kubectl/)
* IDE and JDK
* [DBeaver] (https://dbeaver.io/)

### Perform the following steps to deploy spring boot app on Minikube:
1) Clone this repository
2) From the terminal cd into your project directory and build project using ./mvn clean install
3) Start docker desktop on the system
4) Start minikube using minikube start --driver=docker
5) Enable docker env using command : **_eval $(minikube docker-env)**_ 
6) Build docker image in minikube : docker build -t springboot-mysql-minikube:latest .
7) To see the created image run command : minikube image ls
8) To deploy on kubernetes cluster run command : **_helm install myapp-chart spring-app-chart_**
9) To see deployed helm chart : **_helm ls_**
10) Check deployments : kubectl get all
11) To connect the database run kubectl get services and copy my-sql service name. Then run command like this : **_minikube service myapp-chart-mysql-service --url_**
12) Then connect the database using the IP address and port returned by Step 10.
13) To call Rest api's, open a new Terminal, and run command : _**minikube tunnel**_ and call api from the Postman or any of your favourite tool.
14) Remove or delete deployed setup from kubernetes cluster : **_helm uninstall mychart_**
15) Stop minikube using : **_minikube stop_**

Please read this blog for complete details of this implementation - https://medium.com/@Teqmonic/deploy-spring-boot-with-mysql-on-minikube-cluster-using-helm-f7185e5ad4fa

### commands executed
- docker pull mysql:latest
- docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:latest
- docker ps
- docker build -t spring-mysql-minikube:latest .
- helm create spring-app-chart
- helm install myapp-chart spring-app-chart
- helm list
- helm template spring-app-chart
- minikube start --driver="docker"
- eval ${minikube docker-env}
- minikube image ls
- kubectl get all
- kubectl det deployment
- kubectl get svc
