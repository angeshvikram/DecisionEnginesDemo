# DecisionEnginesDemo
DecisionEnginesDemo

Web service coding challenge
This challenge is to produce a web service using Java or Python.This web service should be a restful API that performs a search with the following requirements:
- The request should accept a search string as input.
- The data to be searched should be in a MongoDB database.
- The response should be formatted in JSON.
- The API should handle at least one scalability concern. Describe which scalability
concerns you picked, and why.
- The API should handle at least one security concern. Describe which security concern
you picked, and why.


## Solution:

  Will create three Docker containers [1: MongoDB 2: Backend Micro-service (Java,Spring)  3: Frontend (Node, AngularJS)

<img width="817" alt="DockerContainers" src="https://user-images.githubusercontent.com/6364184/57551711-935bf080-731e-11e9-8b6c-882451bfcb82.png">

## overall system design
<img width="959" alt="Deployment-diagram" src="https://user-images.githubusercontent.com/6364184/57546995-8cc77c00-7312-11e9-96c0-d583aa4f58e7.png">

### Pre-requisites:

- docker
  https://docs.docker.com/docker-for-mac/install/
  Or
  https://docs.docker.com/docker-for-windows/install/
- docker-compose
  https://docs.docker.com/compose/install/
  
### To run:
  - cd to the project directory
  - docker-compose up
  
 


