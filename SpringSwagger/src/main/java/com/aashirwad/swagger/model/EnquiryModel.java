package com.aashirwad.swagger.model;

import com.aashirwad.swagger.enums.SupportCategory;

public class EnquiryModel {
	
	private Customer customer;
	private SupportCategory supportCategory;
	
	public EnquiryModel(Customer customer, SupportCategory supportCategory) {
		this.customer = customer;
		this.supportCategory = supportCategory;
	}

	public Customer getCustomer() {
		return customer;
	}

	public SupportCategory getSupportCategory() {
		return supportCategory;
	}

	@Override
	public String toString() {
		return "Enquiry [customer=" + customer + ", supportCategory=" + supportCategory + "]";
	}
  
}
