package com.shubham.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shubham.model.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {

}