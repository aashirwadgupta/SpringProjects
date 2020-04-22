package com.aashirwad.swagger.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.aashirwad.swagger.enums.ProductCategory;
import com.aashirwad.swagger.model.ProductModel;

public class ProductDataBuilder {
	
	/**
	 * Prepare a product - new ProductModel(name, weight, price, bestBefore, manufacturedOn, category)
	 * Using each type of product preapre a product list
	 * @return A list of products
	 */
	public static List<ProductModel> prepareProductList() {
		List<ProductModel> productsList = new ArrayList<>();
		LocalDate date = LocalDate.now();
		productsList.add(new ProductModel(1, "Aashirwad Aata", 5.0, 179.00, date.plusDays(90), date.minusDays(90), ProductCategory.AATA));
		productsList.add(new ProductModel(2, "Aashirwad Aata", 10.0, 365.00, date.plusDays(70), date.minusDays(120), ProductCategory.AATA));
		productsList.add(new ProductModel(3, "Jeera", 1.0, 215.00, date.plusDays(180), date.minusDays(150), ProductCategory.SPICES));
		productsList.add(new ProductModel(4, "Chilly Powder", 2.0, 187.00, date.plusDays(165), date.minusDays(200), ProductCategory.SPICES));
		productsList.add(new ProductModel(5, "Salt", 1.0, 17.00, date.plusDays(300), date.minusDays(65), ProductCategory.SPICES));
		productsList.add(new ProductModel(6, "Turmeric", 0.5, 179.00, date.plusDays(90), date.minusDays(60), ProductCategory.SPICES));
		productsList.add(new ProductModel(7, "Amul", 1.0, 57.00, date.plusDays(3), date.minusDays(1), ProductCategory.MILK));
		productsList.add(new ProductModel(8, "Saras", 1.0, 42.00, date.plusDays(2), date.minusDays(2), ProductCategory.MILK));
		productsList.add(new ProductModel(9, "Mix Fruit", 0.250, 135.00, date.plusDays(150), date.minusDays(30), ProductCategory.JAM));
		productsList.add(new ProductModel(10, "Pineapple", 0.250, 110.00, date.plusDays(175), date.minusDays(37), ProductCategory.JAM));
		productsList.add(new ProductModel(11, "Lays", 0.750, 50.00, date.plusDays(60), date.minusDays(60), ProductCategory.SNACKS));
		productsList.add(new ProductModel(12, "Nachos", 0.500, 80.00, date.plusDays(67), date.minusDays(52), ProductCategory.SNACKS));
		productsList.add(new ProductModel(13, "Kellogs", 3.0, 320.00, date.plusDays(225), date.minusDays(95), ProductCategory.SNACKS));
		productsList.add(new ProductModel(14, "Bournvita", 2.5, 375.00, date.plusDays(125), date.minusDays(59), ProductCategory.ENERGY));
		productsList.add(new ProductModel(15, "Horlicks", 2.250, 369.00, date.plusDays(250), date.minusDays(25), ProductCategory.ENERGY));
		productsList.add(new ProductModel(16, "Nestle", 0.200, 50.00, date.plusDays(38), date.minusDays(32), ProductCategory.CHOCLATE));
		productsList.add(new ProductModel(17, "Cadbury", 0.200, 75.00, date.plusDays(49), date.minusDays(47), ProductCategory.CHOCLATE));
		productsList.add(new ProductModel(18, "Bournville", 0.175, 120.00, date.plusDays(60), date.minusDays(15), ProductCategory.CHOCLATE));
		return productsList;
	}

}
