# Flowable Training Demo Project

## Docker environment

Simply run the docker-compose.yml file with:

```bash
$ docker-compose up
```

Once the docker-compose environment is up and running, you can use the applications with the following URLs:

| Application | URL |
|---|---|
| Flowable Control| http://localhost:9988 |
| Mailhog | http://localhost:8025 |

The default credentials are:

- user : admin
- password: test

This docker-compose file contains a Postgresql instance.

## Flowable Training Spring Boot REST Application

- Sample URL -> http://127.0.0.1:18080/hello
- Default credentials
  - Regular user -> user:test
  - Actuator user -> user-actuator:test
  - Flowable REST API user -> user-rest:test
- Database -> MSSQL

## Flowable Training Custom Design application

- URL -> http://localhost:8888 
- Default credentials -> admin:test
- Database -> H2 (until we change it to another one)

By default, this design instance is configured to deploy in the Flowable Training REST application.
