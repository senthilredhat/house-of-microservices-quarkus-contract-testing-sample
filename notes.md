```
podman pod create -n pactBroker -p 9292:9292
podman run -d --name postgres -e POSTGRES_USER=pact -e POSTGRES_PASSWORD=pact123 -e POSTGRES_DB=pact --pod pactBroker postgres
podman run -d --name pact-broker -e PACT_BROKER_DATABASE_USERNAME=pact -e PACT_BROKER_DATABASE_PASSWORD=pact123 -e PACT_BROKER_DATABASE_HOST=postgres -e PACT_BROKER_DATABASE_NAME=pact --pod pactBroker pactfoundation/pact-broker
```
