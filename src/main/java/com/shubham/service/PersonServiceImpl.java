package com.shubham.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.dao.AddressRepository;
import com.shubham.dao.PersonRepository;
import com.shubham.model.Address;
import com.shubham.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	AddressRepository addressRepository;

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		Address address = person.getAddress();
		addressRepository.save(address);
		personRepository.save(person);

	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		Address address = person.getAddress();
		addressRepository.save(address);
		personRepository.save(person);
	}

	@Override
	public Optional<Person> getPersonById(String personId) {
		// TODO Auto-generated method stub
		return personRepository.findById(personId);
	}

	@Override
	public void deletePersonById(String personId) {
		// TODO Auto-generated method stub
		addressRepository.delete(personRepository.findById(personId).get().getAddress());
		personRepository.deleteById(personId);
		;
	}
}
