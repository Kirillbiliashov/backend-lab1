# backend-lab1

## Instructions for launching project locally

1. Copy repository <br />
```
https://github.com/Kirillbiliashov/backend-lab1.git
```
2. Go to project dir <br />
```
cd <path to dir where repo is placed>/backend-lab1
```
3. Build the project using gradle wrapper
```
./gradlew build
```
```
./gradlew run
```
4. Build the project using docker
```
docker build . -t backend-lab1:latest
```
```
docker run -it --rm --network=host -e PORT=8080 backend-lab1:latest
```
4. Build the project using docker compose
```
docker-compose build
```
```
docker-compose up
```
## Deployed endpoint

`https://backend-lab1-9k8s.onrender.com/healthcheck`
