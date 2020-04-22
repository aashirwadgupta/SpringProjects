package com.aashirwad.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aashirwad.swagger.model.ProductModel;
import com.aashirwad.swagger.util.ProductDataBuilder;

@Service
public class ProductService {

	public List<ProductModel> getAllProducts() {
		return ProductDataBuilder.prepareProductList();
	}

	public ProductModel getAProduct(Integer productId) {
		Optional<ProductModel> productOpt = ProductDataBuilder.prepareProductList().stream().filter(product -> product.getId()==productId.intValue()).findFirst();
		return productOpt.isPresent()?productOpt.get():null;
	}

}
