package com.shubham.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shubham.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
