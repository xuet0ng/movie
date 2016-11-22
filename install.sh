#!/bin/bash

# compile
mvn package

# deploy

for pid in $(ps -ef | grep java | grep movie | grep -v grep| awk '{print $2}'); do
  kill -9 $pid
done

screen -dm java -jar target/movie-0.0.1-SNAPSHOT.jar
