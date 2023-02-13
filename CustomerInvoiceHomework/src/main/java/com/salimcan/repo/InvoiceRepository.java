package com.salimcan.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.salimcan.model.Invoice;


public interface InvoiceRepository extends MongoRepository<Invoice, Long> {

}
