FROM ubuntu

RUN apt-get update && apt-get install -y curl

ADD RequestScript.sh script.sh
ENTRYPOINT ["bash", "/script.sh"]
