# distance-calculator Project

Make a web service that accepts two distances (numbers) and returns the total distance (sum of both).

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Approach summary

* Handle the distances and return unit as JSON post request
* The sentence "the requester can specify a unit" means distance types are optional.
* The sentence "for the returned total distance, the requester must specify a unit" means request parameter total distance unit is mandatory.
* I can deduct from the given example that the distances are in whole numbers. It needs however clarification. 
  * I can ask for it later. The aim of this project is to complete it in four hours.
* The returned total distance type must be decimal number.
* I'll treat the distances and returned total as Immutable Value Objects, since they are units of data, in the domain layer
* I'll perform the calculation operation in the service layer that takes a DistanceCalculationRequest
* If I've some time left I'll write ADRs for why I chose Quarkus for this project

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/distance-calculator-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

## Related Guides

- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
