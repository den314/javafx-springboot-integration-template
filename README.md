# JavaFx + Spring Boot Application

## Description
This is working template of the app which integrates JavaFX and Spring Boot all together.

@Autowire'd beans are managed by Spring Container and successfully injected into JavaFX Controllers.

Big thanks to Felix Roske for this integration framework: https://github.com/roskenet/springboot-javafx-support

## Usage
Integration rules are quiet strict and not following them will brake the app.

### Dev profile
App is using embedded H2 DB

### Prod profile
App is using remote MySQL

to test it with remote DB, launch imitation of remote MySQL in docker:

`docker run -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=database_name -p 3306:3306 -d mysql`

and launch the application in `prod` profile
