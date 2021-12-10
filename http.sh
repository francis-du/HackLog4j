#!/usr/bin/env bash

port=2021

rm -rf *.class &&
  javac src/main/java/Hack.java &&
  mv src/main/java/Hack.class .

echo "http://localhost:$port"
sleep 3

python3 -m http.server $port
