package com.salimcan.service;

import java.util.List;
import java.util.Set;

import com.salimcan.model.Industry;
import com.salimcan.model.Invoice;


public interface InvoiceService {
	
	
	List<Invoice> getInvoicesOfCustomersCreatedInJune();
	
	String getTotalCountOfInvoicesByCustomerCreatedInJune();
	
	List<Invoice> getAllInvoices();
	
	List<Invoice> getInvoicesLowerThan(Long amount);
	
	String getAverageCostOfInvoicesGreaterThan(Long amount);
	
	Set<Industry> getIndustriesByCompanyInvoiceLowerThan(Long amount);

}
