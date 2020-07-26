# MySql on Docker

```shell script
docker run --detach --env MYSQL_ROOT_PASSWORD=nitin --env MYSQL_USER=nitin --env MYSQL_PASSWORD=nitin --env MYSQL_DATABASE=todo_db --name mysql --publish 3306:3306 mysql:5.7
```

the conainer runs like

```shell script
nitin@Nitins-MBP-3:~|⇒  docker ps --all
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                               NAMES
e38bf37e8ca7        mysql:5.7           "docker-entrypoint.s…"   6 seconds ago       Up 5 seconds        0.0.0.0:3306->3306/tcp, 33060/tcp   mysql
```