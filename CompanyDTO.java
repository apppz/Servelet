package com.xworkz.company.dto;

import java.time.LocalDate;

public class CompanyDTO {

	private String companyName;
	private String companyFounder;
	private String since;
	private String employee;
	private String address;
	private String business;
	
	public CompanyDTO() {
		System.out.println("companyDTO cons created");
	}

	
	

	public CompanyDTO(String companyName, String companyFounder, String since, String employee, String address,
			String business) {
		super();
		this.companyName = companyName;
		this.companyFounder = companyFounder;
		this.since = since;
		this.employee = employee;
		this.address = address;
		this.business = business;
	}




	public String getCompanyName() {
		return companyName;
	}




	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}




	public String getCompanyFounder() {
		return companyFounder;
	}




	public void setCompanyFounder(String companyFounder) {
		this.companyFounder = companyFounder;
	}




	public String getSince() {
		return since;
	}




	public void setSince(String since) {
		this.since = since;
	}




	public String getEmployee() {
		return employee;
	}




	public void setEmployee(String employee) {
		this.employee = employee;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getBusiness() {
		return business;
	}




	public void setBusiness(String business) {
		this.business = business;
	}




	@Override
	public String toString() {
		return "CompanyDTO [companyName=" + companyName + ", companyFounder=" + companyFounder + ", since=" + since
				+ ", employee=" + employee + ", address=" + address + ", business=" + business + "]";
	}

	
	}
