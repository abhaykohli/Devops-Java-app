# Project structure
``
Devops-Java-app/ │ ├── demo-app/ # Maven-based Java application directory │ ├── src/ # Source code │ ├── pom.xml # Maven POM file │ ├── Jenkinsfile # Jenkins Pipeline script ├── README.md # Project documentation
``
## Sonarqube is setup on ec2 as a docker container and jenkins as standalone service.
### Images of reports 

-----------Complexity report---------
``
``

----------Sonar dashboard------------
`` 
``

-------------Dependency check ----------
##Note getting 403 errors for NVD Api keys , rate limit , api activation
``
``

------------Miscelleaneous/AWS/Jenkins server plugins-------------
``

``
Used ec2 instance with Elastic IP for jenkins server with docker installed in it

