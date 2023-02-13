package com.salimcan.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.salimcan.model.Company;


public interface CompanyRepository extends MongoRepository<Company, Long> {

}
