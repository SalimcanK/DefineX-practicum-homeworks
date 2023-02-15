package com.salimcan.service;

import java.util.List;
import java.util.Set;

import com.salimcan.model.Industry;
import com.salimcan.model.Invoice;


public interface InvoiceService {
	
	
	List<Invoice> findAllInvoices();
	
	List<Invoice> findInvoicesByCostGreaterThan(long cost);
	
	List<Invoice> findInvoicesByCostLessThan(long cost);
	
	String getAverageAbove(Long cost);
	
	Set<Industry> getIndustriesBelow(Long amount);

}