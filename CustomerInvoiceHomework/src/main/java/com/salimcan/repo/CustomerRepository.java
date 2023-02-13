package com.salimcan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salimcan.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
