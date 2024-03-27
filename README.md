
# springbooyt-rest-demo
Create Spring Boot REST Service and Test it via Postman
Step 1 – Create a new Maven Project using Spring Tool Suit 4
Step 2 – Add the following Spring Boot dependencies to the POM file and save.
	spring-boot-starter-parent
	spring-boot-starter-web
Step 3 – Create Person POJO class
Step 4 – Create a PersonController class 
		Add @RestController at class level, This designates the class as a REST controller.
		Add functions to return all persons, new persons as GET REST service
Type of REST web services
	GET - Used to retrieve data from a server. - implemented
	POST - Used to send data to an API. - implemented
	PUT - Used to modify a resource. 
	DELETE- Removes a record from the database
Step 5 – create a Main.java (Spring boot Application class)
Step 6 – Run Main.java as a Java application
Testing Via Postman:
--------------------
Select Request Type as “GET”
Enter URL as “http://localhost:8080/person/”
Click on “Send”.
This will show the “JSON” response sent by the server and verify the response

Get Person By Id
Select Request Type as “GET”
Enter URL as “http://localhost:8080/person/3”,
Click on “Send”.
This will show the “JSON” response sent by the server in the body

Select Request Type as “POST”
Enter URL as “http://localhost:8080/person/newperson”.
Click Body
Select “Raw”
Type as “JSON(Application/JSON”),
Enter the data to be saved in JSON format as shown below.
Click on “Send”.
This will show the HTTP Status 200 sent by the server.
{
        "id": 1,
        "name": "Ram",
        "age": 30
    }
