### Install dependency
##### pre-requisite: install java 8
    depends on OS
#### dependency
	mvn compile package

##### add jvm option from parameters in maven build
    -Dspring.datasource.url=jdbc:postgresql://${url} -Dspring.datasource.username=${username} -Dspring.datasource.password=${password}

### Local Dev Environment
#### spin up database from docker
	docker pull postgres
	docker run --name dealerDB -e POSTGRES_DB=dealer -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres

### Run Application
    mvn clean compile package -DskipTests=true && java -jar target/car-dealer-0.0.1-SNAPSHOT.war --spring.datasource.url=${url} --spring.datasource.username=${username} --spring.datasource.password=${password}
    
   mvn clean compile package -DskipTests=true && java -jar target/car-dealer-0.0.1-SNAPSHOT.war --spring.datasource.url=jdbc:postgresql://localhost:5432/dealer_dev --spring.datasource.username=admin --spring.datasource.password=password123
