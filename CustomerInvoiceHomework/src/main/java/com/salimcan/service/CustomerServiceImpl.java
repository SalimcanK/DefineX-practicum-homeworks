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


	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}


	@Override
	public List<Customer> findCustomersContaining(String string) {
		
		return customerRepo.findCustomersContaining(string);
	}


	@Override
	public List<Customer> findCustomersByMonth(Integer month) {
		
		return customerRepo.findCustomersByMonth(month);
	}

}
