#!/usr/bin/env bash

while :
do
  curl -X POST http://localhost:8080/address/89230410 -i
  printf "\nPress <CTRL+C> to exit."
  sleep 1
done


