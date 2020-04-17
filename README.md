# microservice-address
Microservice in Kotlin

# Target:

### The main objective of this project is to understand the Kotlin language and how it can be used in the context of microservices.

# Tech Stack:

### -> Spring Boot
### -> Kotlin
### -> Jaeger (OpenTracing)

# How stuff works:

### docker run -d -p 5775:5775/udp -p 16686:16686 jaegertracing/all-in-one:latest

### Open in your browser: http://localhost:16686

### In another terminal:

### git clone https://github.com/HectorIFC/microservice-address.git

### ./mvnw clean install

### ./mvnw spring-boot:run

### Open another terminal:

### ./request-test.sh

## PS:
### Thanks to the ELIEZER RODRIGUES for the tutorial.
### source: https://www.zup.com.br/blog/microsservico-com-opentrace-em-kotlin
