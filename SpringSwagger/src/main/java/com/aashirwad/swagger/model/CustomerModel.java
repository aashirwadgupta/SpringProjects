package com.aashirwad.swagger.model;

public class CustomerModel {
	
	public static final CustomerModel AASHIRWAD = new CustomerModel("Aashirwad"); 
	public static final CustomerModel AKANKSHA = new CustomerModel("Akanksha"); 
	public static final CustomerModel AMAN = new CustomerModel("Aman"); 
	public static final CustomerModel ANAMIKA = new CustomerModel("Anamika"); 

	private String name;
	
	public CustomerModel(String name) {
		this.name = name;
	}
	
	public void reply(final String message) {
		System.out.printf("%s: %s %n", name, message);
	}
}
