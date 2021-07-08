# spring-secure-api

## Using Docker
A jar file can be created by running `./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar`  
So to make this, and run it on a docker container, have a look at the `Dockerfile` and run the following to create an image
`docker build -t spring-secure-api .` then to run it do the `docker run -p 8080:8080 spring-secure-api`
