package com.shubham.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

	@Id
	private String id;

	private String name;

	@DBRef
	private Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// getters and setters

}