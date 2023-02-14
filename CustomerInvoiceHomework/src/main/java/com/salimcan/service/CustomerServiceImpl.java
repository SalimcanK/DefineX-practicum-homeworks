package com.salimcan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salimcan.model.Customer;
import com.salimcan.repo.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	CustomerRepository customerRepo;
	
	
	@Override
	public List<Customer> findAllCustomers() {
		
		return customerRepo.findAll();
	}

}
