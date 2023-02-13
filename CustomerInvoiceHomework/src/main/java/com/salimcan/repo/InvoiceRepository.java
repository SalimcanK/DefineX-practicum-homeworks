package com.salimcan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salimcan.model.Invoice;


public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	
}