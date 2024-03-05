# Spring Authenticated Login System Template
A Spring backend template, with JWT authenticated login system and registration, from [Unknown Koder's Tutorial](https://www.youtube.com/watch?v=TeBt0Ike_Tk).

The template was initialized with [Spring Initializr](https://start.spring.io/) with the following settings
- Build Tool: Maven
- Language: Java 17
- Spring Boot Version: 3.1.9
- Dependencies:
  - `Spring Web`
  - `Spring Data JPA`
  - `Spring Security` - allows us to restrict user access to controller actions
  - `OAuth2 Resource Server` - allows us to grant user access to restricted actions based on their roles/authorities
  - `Spring Boot DevTools`
  - (Database Choice From):
    - `MySQL Driver` (implemented)
    - `Spring Data MongoDB`
    - `Spring Data Reactive MongoDB` (for handling high concurrency)

### Notes
- user roles are manually added/initialized on application startup in `SpringAuthenticatedLoginApplication.java`
- an admin user is then created with credentials
  - Username: `admin`
  - Password: `password`
- might have to open up MySQL workbench for database creation to work
  - try drop database schema and re-run the app if needed

### Consider...
- [renaming the Spring Project](https://senoritadeveloper.medium.com/rename-a-spring-boot-maven-project-in-intellij-a8e006af97c7#:~:text=Go%20to%20src%2Fmain%2Fjava,and%20select%20Refactor%2D%3ERename.)
- filling in project `<description>` in `pom.xml`
- deleting the `.git` repository and `git init` a new one if the template repository was cloned
- update `DB_DATABASE_NAME`, `DB_USERNAME`, `DB_PASSWORD` in `application.properties`
- or create a `env.properties` file for storing environment variables for database credentials or secrets
```
DB_DATABASE_NAME=dbname
DB_USERNAME=name
DB_PASSWORD=pword
```
- update `@CrossOrigin("*")` in REST controllers for more restrictions, to frontend apps only, for example
- removing this `README.md` file

### Template improvements
- add tests
- use enums for roles