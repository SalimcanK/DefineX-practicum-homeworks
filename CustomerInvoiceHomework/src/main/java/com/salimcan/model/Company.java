package com.salimcan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name = "company")
public class Company {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id", nullable = false)
	private long companyId;
	
	@Column(name = "industry")
	@Enumerated(EnumType.STRING)
	private Industry industry;
	
	@Column(name = "company_name")
	private String name;

	
	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public Industry getIndustry() {
		return industry;
	}

	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}