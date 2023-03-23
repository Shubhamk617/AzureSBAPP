package com.shubham.service;

import java.util.Optional;

import com.shubham.model.Person;

public interface PersonService {
	public void savePerson(Person person);
	public void updatePerson(Person person);
	public Optional<Person> getPersonById(String personId);
	public void deletePersonById(String personId);
}
