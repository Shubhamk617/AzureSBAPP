package com.shubham.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.model.Person;
import com.shubham.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService personService;

	@PostMapping("/savePerson")
	private void savePerson(@RequestBody Person person) {
		// TODO Auto-generated method stub
		personService.savePerson(person);
	}

	@PutMapping("/updatePerson")
	private void updatePerson(@RequestBody Person person) {
		// TODO Auto-generated method stub
		personService.savePerson(person);
	}

	@GetMapping("/getPersonById")
	private Optional<Person> getPersonById(@RequestParam String personId) {
		// TODO Auto-generated method stub
		return personService.getPersonById(personId);
	}

	@DeleteMapping("/deletePersonById")
	private void deletePersonById(@RequestParam String personId) {
		// TODO Auto-generated method stub
		personService.deletePersonById(personId);
	}

	@GetMapping("/helloWorld")
	private String helloWorld(@RequestParam String personName) {
		// TODO Auto-generated method stub
		return "Hello from azure demo application by :: " + personName;
	}

}
