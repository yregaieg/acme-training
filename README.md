# Flowable Training Demo Project

## Docker environment

Simply run the docker-compose.yml file with:

```bash
$ docker-compose up
```

Once the docker-compose environent is up and running, you can use the applications with the following URLs:

| Application | URL |
|---|---|
| Flowable Work | http://localhost:8080 |
| Flowable Control| http://localhost:9988 |
| Mailhog | http://localhost:8025 |

The default credentials are:

- user : admin
- password: test

This docker-compose file contains a Postgresql instance for the Flowable applications and a SQL Server instance for the Spring Boot application.

The first time you run the docker-compose, you must connect to mssql anc create the flowable database:

```sql
CREATE DATABASE flowable;
```

IMPORTANT: MSSQL DOES NOT HAVE A PERSISTENT VOLUME CONFIGURED.

The default mssql credentials can be found in the application.properties file.

## Flowable Training Spring Boot REST Application

- Sample URL -> http://127.0.0.1:18080/hello
- Default credentials
  - Regular user -> user:test
  - Actuator user -> user-actuator:test
  - Flowable REST API user -> user-rest:test

## Flowable Training Custom Design application

- URL -> http://localhost:8888 
- Default credentials -> admin:test
- Database -> H2 (until we change it to another one)

By default, this design instance is configured to deploy to Flowable Work.
