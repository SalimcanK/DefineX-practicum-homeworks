package com.salimcan.service;

import java.util.List;

import com.salimcan.model.Customer;


public interface CustomerService {
	
	List<Customer> findAllCustomers();
	
	Customer addCustomer(Customer customer);
	
	List<Customer> findCustomersContaining(String string);
	
	List<Customer> findCustomersByMonth(Integer month);

}
