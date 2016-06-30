# Steps to run the application


### 1. Start Eureka Server

Go to eureka-server directory and run the command : `mvn spring-boot:run`. Once started Eureka Server will be avaialble at `http://localhost:8761/`

### 2. Start Eureka Config

Go to eureka-config directory and run the command : `mvn spring-boot:run`.  Once started Eureka Config server will be avaialble at `http://localhost:8888/` and bind itself with Eureka Server.


### 3. Start Eureka Client

Go to eureka-client directory and run the command : `mvn spring-boot:run`. Once started Eureka Client server will be accessible at `http://localhost:2222/` and bind itself with Eureka Server.


### 4. Start Employee Service - One

Go to employee-service-one directory and run the command : `mvn spring-boot:run`. Once started Employee Service - One will be accessible at `http://localhost:9999/employee/get` and bind itself with Eureka Server.


### 5. Start Employee Service - Two

Go to employee-service-two directory and run the command : `mvn spring-boot:run`. Once started Employee Service - Two will be accessible at `http://localhost:9991/employee/get` and bind itself with Eureka Server.


Once all the servers are started access Eureka Client at `http://localhost:2222/employee-service/employee/get` which acts as a load balancer for both the employee-service.
