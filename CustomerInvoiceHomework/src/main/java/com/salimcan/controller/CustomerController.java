package com.salimcan.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.salimcan.service.CustomerServiceImpl;


@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerServiceImpl customerService;
	
	
    public void redirect(HttpServletResponse response) throws IOException {

        response.sendRedirect("/swagger-ui.html");
    }
	

}
