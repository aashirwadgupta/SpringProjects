package com.aashirwad.swagger.model;

import java.time.LocalDate;
import java.util.Comparator;

import com.aashirwad.swagger.enums.ProductCategory;


public class ProductModel {
	
	public static final Comparator<ProductModel> BY_ID = Comparator.comparing(ProductModel::getId);
	public static final Comparator<ProductModel> BY_NAME = Comparator.comparing(ProductModel::getName);
	public static final Comparator<ProductModel> BY_WEIGHT = Comparator.comparing(ProductModel::getWeight);

	private int id;
	private String name;
	private double weight;
	private double price;
	private LocalDate bestBefore;
	private LocalDate manufacturedOn;
	private ProductCategory category;
	
	public ProductModel(int id, String name, double weight) {
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	public ProductModel(int id, String name, double weight, double price, LocalDate bestBefore, LocalDate manufacturedOn,
			ProductCategory category) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.bestBefore = bestBefore;
		this.manufacturedOn = manufacturedOn;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getBestBefore() {
		return bestBefore;
	}
	public void setBestBefore(LocalDate bestBefore) {
		this.bestBefore = bestBefore;
	}
	public LocalDate getManufacturedOn() {
		return manufacturedOn;
	}
	public void setManufacturedOn(LocalDate manufacturedOn) {
		this.manufacturedOn = manufacturedOn;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	
}
