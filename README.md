# helloServiceBackend
Hello Service Backend.

It is a Spring Boot Application with the below API:

API : URL : /hello   (http://localhost:8080/hello)
    : Response : String --> "Hello <Name>"

To run it run it as a spring boot application and the application will be up and running on port 8080
  
  Additionally the CORS origin requests has been enabled.
  Also, the Security of this application has been turned off for the timebeing to enable running it smoothly with being required to login.

    
    
    Deploying the Application to Kubernates.
    
    1. Build the image with name "spring-boot-test" --> docker build -t spring-boot-test .
    2. Deploy in kubernates --> kubectl apply -f deployment.yaml
    
