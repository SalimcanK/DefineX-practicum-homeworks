package com.salimcan.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salimcan.model.Industry;
import com.salimcan.model.Invoice;
import com.salimcan.service.InvoiceServiceImpl;


@RestController
public class InvoiceController {

	
	@Autowired
	InvoiceServiceImpl invoiceService;
	
	
	@GetMapping("/invoices")
    public ResponseEntity<List<Invoice>> getAllInvoices() {
    	
    	List<Invoice> invoices = invoiceService.findAllInvoices();
    	return new ResponseEntity<>(invoices, HttpStatus.OK);
    }
	
	@GetMapping("/invoicesGreater")
	public ResponseEntity<List<Invoice>> getInvoicesGreaterThan(long cost) {
		
		List<Invoice> invoices = invoiceService.findInvoicesByCostGreaterThan(cost);
		return new ResponseEntity<>(invoices, HttpStatus.OK);
	}
	
	@GetMapping("/invoicesLower")
	public ResponseEntity<List<Invoice>> getInvoicesLowerThan(long cost) {
		
		List<Invoice> invoices = invoiceService.findInvoicesByCostLessThan(cost);
		return new ResponseEntity<>(invoices, HttpStatus.OK);
	}
	
	@GetMapping("/invoicesAverageAbove")
	public ResponseEntity<String> getAverageAbove(double cost) {
		
		Long longCost = (long) cost;
		return ResponseEntity.ok(invoiceService.getAverageAbove(longCost));
		
	}
	
	@GetMapping("/getIndustriesBelow")
	public ResponseEntity<Set<Industry>> getIndustriesBelow(long cost) {
	        
	    Set<Industry> industry = invoiceService.getIndustriesBelow(cost);
	    return new ResponseEntity<>(industry, HttpStatus.OK);
	 }
}
