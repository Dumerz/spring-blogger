
# [Dumerz/spring-blogger](https://github.com/Dumerz/spring-blogger)

A blog application powered by [**Spring Boot**](https://spring.io) 


## Getting Started

This is a simple **blog application** developed using [**Spring Boot 2.3.0**](https://spring.io). This application serves, manages, organizes, secures and stores blogs or posts in a web application. The application implements the basic principles of **MVC** (Model, View, Controller) and [**REST**](https://restfulapi.net) architecture. This module is not build to be a full stack application but a starting module where you can build your smart ideas. So as a developer like you think, build and share your ideas. 


## Spring Boot version

This application is built using [**Spring Boot 2.3.0**](https://spring.io).


## System dependencies
The following are dependencies to run [**spring-blogger**](https://github.com/Dumerz/spring-blogger):

* [**Java 8+**](https://git-scm.com/)
* [**Maven 3.2+**](https://maven.apache.org/)

You can also checkout this [**link**](https://docs.spring.io/spring-boot/docs/1.5.21.RELEASE/reference/html/getting-started-system-requirements.html) to know more about the dependencies for [**Spring Boot**](https://spring.io).


## Software Dependencies
The following are other required software in installing and running the application to your host:

 - [**Git**](https://git-scm.com/)
 - [**PostgreSQL**](https://postgresql.org/)


## Installation

Navigate to your chosen directory.

    $ cd ./chosen/directory

Clone this repository to your chosen directory using [**git**](https://git-scm.com/).

    $ git clone https://github.com/Dumerz/spring-blogger.git
    
Install all dependencies needed for this module using [**maven**](https://maven.apache.org/). Run the following command inside the application directory.

    $ mvn install


## Database initialization

To set the database for the application, we must first create the database using PostgreSQL.
    postgres=# CREATE DATABASE my_database

Next to connect the database to the application, you need to do some changes first to **application.properties.example**

In your project directory go to:

    cd src\main\resources\

Copy or rename the file **application.properties.example** to **application.properties**.

Open **application.properties** and change the value of the following parameters depending on your needs.

    ## Spring Datasource Configuration
    spring.datasource.url=jdbc:postgresql://localhost:5432/YOUR_DATABASE_HERE
    spring.datasource.username=YOUR_USER_NAME_HERE
    spring.datasource.password=YOUR_PASSWORD_HERE

Example

    ## Spring Datasource Configuration
    spring.datasource.url=jdbc:postgresql://localhost:5432/my-database
    spring.datasource.username=name_user
    spring.datasource.password=secret

To generate and build the database scheme of the application just uncomment the **spring.jpa.hibernate.ddl-auto** parameter by removing the **##** sign. This will create tables and relations inside your database. After the scheme is generated remove the **spring.jpa.hibernate.ddl-auto** parameter or set the value to **none**.


## Starting the Server

You now have a functional Spring Boot application. Let us now start the application on your host. 

Navigate to your application directory.

    $ cd ./chosen/directory/spring-blogger

Next run the following command in your terminal.

    $ mvnw spring-boot:run

Then in your web browser go to the following address to access the application.
    [**http://localhost:8080/**](http://localhost:8080/)


## License

This application is under the MIT License.
You can also check the **License.txt** in the directory for your reference.