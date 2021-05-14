## <a name="unit-testing-lab-assignment"></a>Unit Testing Lab assignment

**Java project using JUnit for Unit Testing.**

The purpose of this project is to get familiar with Junit Testing as well as with Continuous Integration services and Code Coverage services.

## How to run the tests

To run the JUnit test execute the following Maven command:	
	
	mvn test
	
## Build Project 

In order to build the project and generate the Jacoco code coverage report simply run the following Maven command

	mvn package jacoco:report
	
The Jacoco report will be placen in the following path:

	target/site/jacoco

## Continuous Integration Services

This repository uses TravisCI services to make sure that each integration is tested and verified by an automated build.

[Here](https://docs.travis-ci.com/user/tutorial/) is a Tutorial on how to use Travis for Continuous Integration.
