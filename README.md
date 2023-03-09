# Guide

## Prerequisites
- Docker

``` git clone https://github.com/aligirisen/LHService.git ```

``` cd LhService ```

``` docker build -t mongo1 . ```

- if you have any issue with build phase it cause by permission. At the start of build command use sudo command  

``` docker build -f Dockerfile_Spring -t spring_image . ```

- Change the permission of data volume

``` sudo chmod 777 db ```


``` docker-compose up -d ```


- Use the following command for GET request.
``` curl http://<lsService-spring-1 url>:8080/london_houses ```

  - if you have response as  HTTP 404, check your mongodb container and permissions.
  - if you have response as connection refuse, your lhservice-spring-1 ip is wrong.


- if you want to access mongodb run below command as container is running.
```
docker exec -ti lhservice-mongo-1 mongosh -u root -p example --authenticationDatabase admin } 
```






- All of these processes applied in ubuntu 22.04 host machine.