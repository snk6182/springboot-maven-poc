# Spring Boot Maven POC

A small Spring Boot REST application intended for Maven, Git, CI/CD and deployment POCs.

## Prerequisites

- Java 17+
- Maven 3.6.3+
- Git

## Build

```bash
mvn clean package
```

The executable JAR is created under `target/`.

## Run locally

```bash
mvn spring-boot:run
```

Or:

```bash
java -jar target/springboot-maven-poc-0.0.1-SNAPSHOT.jar
```

## Test

```bash
mvn test
```

## Endpoints

- `GET /` - application information
- `GET /api/hello` - sample response
- `GET /actuator/health` - Spring Boot health check

Default port: `8080`

Example:

```bash
curl http://localhost:8080/api/hello
curl http://localhost:8080/actuator/health
```

## Docker

Build the Maven artifact first:

```bash
mvn clean package
```

Then:

```bash
docker build -t springboot-maven-poc:1.0 .
docker run -d --name springboot-maven-poc -p 8080:8080 springboot-maven-poc:1.0
```

## Suggested Git workflow

```bash
git init
git add .
git commit -m "Initial Spring Boot Maven POC"
git branch -M main
git remote add origin <YOUR-GIT-REPOSITORY-URL>
git push -u origin main
```

## CI/CD POC ideas

This project is intentionally simple so you can add:

1. Maven build and unit-test stage
2. SonarQube scan
3. Docker image build
4. Docker image tagging with Git commit SHA
5. Push to ECR
6. Deploy to EC2/ECS/EKS
7. Health-check validation
8. Automated rollback
