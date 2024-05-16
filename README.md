# Задание 1
Для запуска необходимо ввести
```console
./build_and_deploy
```

Запускаем сервис
```console
minikube service app-service
```
По полученному IP можно делать необходимые запросы
```console
|-----------|-------------|-------------|------------------------|
| NAMESPACE |    NAME     | TARGET PORT |          URL           |
|-----------|-------------|-------------|------------------------|
| default   | app-service |             | http://127.0.0.1:42253 |
|-----------|-------------|-------------|------------------------|
```
В данном случае, по данным адресам можно делать запросы:

http://127.0.0.1:42253/time

http://127.0.0.1:42253/statistics

Файл со статистикой можно вытащить зная имя.
```console
kubectl get pods
NAME                                 READY   STATUS    RESTARTS   AGE
app-deployment-85ccfd8d89-tjpl7      1/1     Running   0          115s
requests-client-6988f5dd57-xd46v     1/1     Running   0          115s
kubectl cp requests-client-6988f5dd57-xd46v:result.txt ./out.txt
```
В папке imgs несколько скринов из терминала, подтверждающих что все работает