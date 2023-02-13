package com.salimcan.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.salimcan.model.Customer;


public interface CustomerService {
	
	
	List<Customer> getAllCustomers();
	
	ResponseEntity<?> addCustomer(Customer customer);
	
	List<Customer> getCustomersNameContainingC();
	
	List<Customer> getCustomersCreatedInJune();
	
	Set<String> getCustomerNamesWithLowerThan(Long amount);
	
}
