#!/bin/bash

# compile
mvn package

# deploy
ps -ef | grep java | grep movie | grep -v grep| awk '{print $2}' | xargs kill -9
screen -dm java -jar target/movie-0.0.1-SNAPSHOT.jar
