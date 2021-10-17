# helloServiceBackend
Hello Service Backend.

It is an Spring Boot Application with the below API:

It follows the MVC design pattern where the API handler is in the controller package which when invoked returns the response as below.

API : URL : /hello   (http://localhost:8080/hello)
    : Response : String --> "Hello <Name>"
    : GET request
To run it run it as a spring boot application and the application will be up and running on port 8080
  
  Additionally the CORS origin requests has been enabled.
  Also, the Security of this application has been turned off for the timebeing to enable running it smoothly without being required to login.

   
    
    Deploying the Application to Kubernates.
    
    1. Build the image with name "spring-boot-test" --> docker build -t spring-boot-test .
    2. Deploy in kubernates --> kubectl apply -f deployment.yaml
    
