package com.aashirwad.swagger.enums;

public enum ProductCategory {

	AATA ("aata"),
	SPICES ("spices"),
	MILK ("milk"),
	JAM ("jam"),
	ENERGY ("energy"),
	CHOCLATE ("choclate"),
	SNACKS ("snacks");
	
	public final String category;
	 
    private ProductCategory(String category) {
        this.category = category;
    }
}
