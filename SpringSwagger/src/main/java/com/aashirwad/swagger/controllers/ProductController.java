package com.aashirwad.swagger.controllers;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aashirwad.swagger.model.ProductModel;
import com.aashirwad.swagger.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@ApiOperation(value="Get All products.", notes="Get All products available irrespective of the category.")
	@GetMapping("/getProducts")
	public ResponseEntity<List<ProductModel>> getAllProducts() {
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<ProductModel> getAProduct(@PathVariable("productId") Integer productId) {
		return new ResponseEntity<>(productService.getAProduct(productId), HttpStatus.OK);
	}
}
