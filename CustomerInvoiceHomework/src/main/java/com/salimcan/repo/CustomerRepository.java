package com.salimcan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salimcan.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
