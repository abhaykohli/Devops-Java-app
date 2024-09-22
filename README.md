# Project structure
``
Devops-Java-app/ │ ├── demo-app/ # Maven-based Java application directory │ ├── src/ # Source code │ ├── pom.xml # Maven POM file │ ├── Jenkinsfile # Jenkins Pipeline script ├── README.md # Project documentation
``
## Sonarqube is setup on ec2 as a docker container and jenkins as standalone service.
### Images of reports 

-----------Complexity report---------
``
![Complexity-report](https://github.com/user-attachments/assets/1ce2bc73-d437-4915-86c9-1f2faa4fd212)
``

----------Sonar dashboard------------
`` 
![sonarqube](https://github.com/user-attachments/assets/9c782088-db46-4396-b0d5-6b0d7c7f3fb4)
``

-------------Dependency check ----------
##Note getting 403 errors for NVD Api keys , rate limit , api activation
``
![Dependency check](https://github.com/user-attachments/assets/548a3826-6e2d-4ff0-97d5-af9f23c92a37)
``

------------Miscelleaneous/AWS/Jenkins server plugins-------------
``
![Docker_container](https://github.com/user-attachments/assets/c5e5cd5b-04bc-4240-8469-8d5ee9bc8175)
![Sonarqube plugin](https://github.com/user-attachments/assets/f3def7c3-84bb-486c-89c2-33b8d80b09da)
![Nvd api key error](https://github.com/user-attachments/assets/a33b20fb-cce3-48f5-8fda-398d91d2ec3b)
![Jenkinsserver](https://github.com/user-attachments/assets/111102cf-50aa-40b7-ae41-a52e4f4695b2)
``
Used ec2 instance with Elastic IP for jenkins server with docker installed in it

