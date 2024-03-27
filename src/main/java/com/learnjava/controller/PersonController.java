package com.learnjava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnjava.model.Person;

@RestController
public class PersonController {

	/* http://localhost:8080 */
	@RequestMapping("/")
	String home() {
		return "Create Spring Boot REST Service and Test it via Postman!";
	}
	
	/* http://localhost:8080/person/ */
	@GetMapping("/person")
	public List<Person> getAllPersons(){
		//Returns hardcoded data, a real world application would return from the database
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(1,"Ram", 30));
		personList.add(new Person(2,"Lakshman", 35));
		personList.add(new Person(3,"Kirshna", 15));
		return personList;
	} 
	
	/* http://localhost:8080/person/3 */
	
	@GetMapping("/person/{personId}")
	public Person getPersonWithId(@PathVariable Integer personId){
		//Returns hardcoded data, a real world application would return from the database
		return new Person(personId.intValue(),"Lakshmi", 15);
	} 
	
	/* http://localhost:8080/person/newperson */
	@PostMapping("/person/newperson")
	public void addPerson(@RequestBody Person person){
		//Just has a Sysout stmt, a real world application would save this record to the database
		System.out.println("Saving person information");
		
	}

}
