#!/bin/bash

kubectl delete service app-service
kubectl delete deployment app-deployment
kubectl delete deployment requests-client


docker rmi requests-image
docker rmi firstapp-image
