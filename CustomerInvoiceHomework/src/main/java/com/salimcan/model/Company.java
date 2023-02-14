package com.salimcan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id", nullable = false)
	public long companyId;
	
	@Column(name = "industry")
	@Enumerated(EnumType.STRING)
	public Industry industry;
	
	@Column(name = "company_name")
	public String name;
	
}