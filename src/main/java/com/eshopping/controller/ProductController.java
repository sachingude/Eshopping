package com.eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eshopping.dto.ProductDto;
import com.eshopping.model.Product;
import com.eshopping.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService ProductService;
	
	@GetMapping("/getDemo")
	public String getDemo()
	{
		System.out.println("welcome to java");
		
		return "welcome to spring boot";
	}

	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProductDetails(@RequestBody ProductDto productDto)
	{
		Product productdata=ProductService.saveProduct(productDto);
		
		return ResponseEntity.ok(productdata);
		
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProductDetails()
	{
		List<Product> getData=ProductService.getProductDetails();
		
		return getData;
	}
	
	
	
	
}
