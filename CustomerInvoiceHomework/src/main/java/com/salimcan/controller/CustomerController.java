package com.salimcan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salimcan.model.Customer;
import com.salimcan.service.CustomerServiceImpl;

import springfox.documentation.annotations.ApiIgnore;


@RestController
public class CustomerController {
	
	
	@ApiIgnore
	@GetMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {

        response.sendRedirect("/swagger-ui.html");
    }
    
    
    @Autowired
    CustomerServiceImpl customerService;
    
    
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
    	
    	List<Customer> customers = customerService.findAllCustomers();
    	return new ResponseEntity<>(customers, HttpStatus.OK);
    }
    
    @PostMapping("/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
    	
    	Customer newCustomer = customerService.addCustomer(customer);
    	return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
    
    @GetMapping("/customerC")
    public ResponseEntity<List<Customer>> getCustomersContainingC() {
    	
    	List<Customer> customers = customerService.findCustomersContaining("c");
    	return new ResponseEntity<>(customers, HttpStatus.OK);
    }
    
    @GetMapping("/customerMonth")
    public ResponseEntity<List<Customer>> getCustomersCreatedInJune() {
    	
    	List<Customer> customers = customerService.findCustomersByMonth(6);
    	return new ResponseEntity<>(customers, HttpStatus.OK);
    }

}
