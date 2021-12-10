#!/usr/bin/env bash

port=2021
class=src/main/java/Hack.class

rm -rf *.class &&
  javac src/main/java/Hack.java &&
  mv $class .

sleep 3

if [ -f "Hack.class" ]; then
  echo "http://localhost:$port"
  python3 -m http.server $port
else
  echo "$class not exists"
fi
