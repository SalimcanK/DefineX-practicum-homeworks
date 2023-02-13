package com.salimcan.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salimcan.model.Industry;
import com.salimcan.model.Invoice;
import com.salimcan.repo.InvoiceRepository;


@Service
public class InvoiceServiceImpl implements InvoiceService {

	
	@Autowired
	InvoiceRepository invoiceRepo;

	
	@Override
	public List<Invoice> getInvoicesOfCustomersCreatedInJune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTotalCountOfInvoicesByCustomerCreatedInJune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoice> getInvoicesLowerThan(Long amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAverageCostOfInvoicesGreaterThan(Long amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Industry> getIndustriesByCompanyInvoiceLowerThan(Long amount) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
