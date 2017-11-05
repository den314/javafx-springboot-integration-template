# PizzaService Application

## Description
This application provides functionality of orders in pizza restaurant.

### Dev profile
App is using embedded H2 DB
### Prod profile
App is using remote MySQL

to test it, launch imitation of remote MySQL in docker:

`docker run -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=pizzaservice -p 3306:3306 -d mysql`

and launch the application in `prod` profile
