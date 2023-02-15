package com.salimcan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salimcan.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query("SELECT c FROM Customer c WHERE LOWER(c.fullName) LIKE LOWER(concat('%', ?1,'%'))")
	List<Customer> findCustomersContaining(String string);
	
	@Query("SELECT c FROM Customer c WHERE MONTH(c.createdDate) = ?1")
	List<Customer> findCustomersByMonth(Integer month);

}
