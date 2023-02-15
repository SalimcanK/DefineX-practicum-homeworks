package com.salimcan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salimcan.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
