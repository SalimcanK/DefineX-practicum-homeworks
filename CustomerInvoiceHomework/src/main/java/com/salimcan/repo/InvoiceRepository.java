package com.salimcan.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.salimcan.model.Customer;
import com.salimcan.model.Industry;
import com.salimcan.model.Invoice;


public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	
	
	List<Invoice> findInvoicesByCostGreaterThan(long cost);
	
	List<Invoice> findInvoicesByCostLessThan(long cost);
	
	List<Invoice> findInvoicesByCustomer(Customer customer);
	
	@Query(value = "SELECT c.industry FROM company c WHERE c.company_id IN (SELECT b.company_id FROM invoice b WHERE date_part('month', b.created_date) = 6 GROUP BY b.company_id HAVING AVG(b.cost) < :amount)", nativeQuery = true)
    Set<Industry> findCompanyIndustryWhereCostLessThanEqual(@Param(value = "amount") Long amount);

}
