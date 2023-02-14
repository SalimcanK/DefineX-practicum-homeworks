package com.salimcan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salimcan.model.Customer;
import com.salimcan.service.CustomerServiceImpl;


@RestController
public class CustomerController {
	
	
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

}
