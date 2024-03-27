# springbooyt-rest-demo

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
