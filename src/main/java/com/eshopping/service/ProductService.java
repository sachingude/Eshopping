package com.eshopping.service;

import java.util.List;

import com.eshopping.dto.ProductDto;
import com.eshopping.model.Product;

public interface ProductService {

	public Product saveProduct(ProductDto productDto);
	
	public List<Product> getProductDetails();
}
