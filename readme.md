mvn package
java -jar target/dependency/jetty-runner.jar target/*.war
http://localhost:8080/rest/player/players/