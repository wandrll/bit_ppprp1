#!/bin/bash

minikube start
eval $(minikube docker-env)

# build applications
mvn install -f ./firstapp

# build containers
docker build -t firstapp-image ./firstapp
docker build -t requests-image ./scripts


kubectl apply -f ./deploy/app-deployment.yaml --validate=true
kubectl apply -f ./deploy/app-service.yaml --validate=true
kubectl apply -f ./deploy/requests-deployment.yaml --validate=true


minikube tunnel
