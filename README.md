### Install dependency
##### pre-requisite: install java 8
    depends on OS
#### dependency
	mvn compile package

### Local Dev Environment
#### spin up database from docker
	docker pull postgres

	docker run --name dealerDB -e POSTGRES_DB=dealer -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres
##### password jvm option from parameters
    -Dspring.datasource.url=jdbc:postgresql://${url} -Dspring.datasource.username=${username} -Dspring.datasource.password=${password}


##### copy to generate local database property and fill in the information
	cp src/main/resources/application-local.properties src/main/resources/application.properties

### Run Application
    mvn package && java -jar target/car-dealer-0.0.1-SNAPSHOT.war