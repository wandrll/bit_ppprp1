#!/bin/bash

OUTPUT_FILE="result.txt"
URL="http://app-service"

rm $OUTPUT_FILE

while [ 1 ]
do
  curl $URL/statistics >> $OUTPUT_FILE
  echo '' >> $OUTPUT_FILE
  sleep 5s
done