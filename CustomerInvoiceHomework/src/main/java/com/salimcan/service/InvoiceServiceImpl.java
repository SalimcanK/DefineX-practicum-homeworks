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
	public List<Invoice> findAllInvoices() {
		
		return invoiceRepo.findAll();
	}

	@Override
	public List<Invoice> findInvoicesByCostGreaterThan(long cost) {
		
		return invoiceRepo.findInvoicesByCostGreaterThan(cost);
	}

	@Override
	public List<Invoice> findInvoicesByCostLessThan(long cost) {
		
		return invoiceRepo.findInvoicesByCostLessThan(cost);
	}

	@Override
	public Set<Industry> getIndustriesBelow(Long amount) {
		
		return invoiceRepo.findCompanyIndustryWhereCostLessThanEqual(amount);
	}

	@Override
	public String getAverageAbove(Long cost) {
		
		List<Invoice> invoiceList = invoiceRepo.findInvoicesByCostGreaterThan(cost);
		double average = invoiceList.stream()
				.mapToLong(Invoice::getCost)
                .average()
                .orElse(0.0);
		
		return String.valueOf(average);
	}

}
