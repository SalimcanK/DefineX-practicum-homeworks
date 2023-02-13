package com.salimcan.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.salimcan.model.Customer;


public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
