package com.salimcan.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.salimcan.model.Customer;
import com.salimcan.repo.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepo;

	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersNameContainingC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomersCreatedInJune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getCustomerNamesWithLowerThan(Long amount) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
