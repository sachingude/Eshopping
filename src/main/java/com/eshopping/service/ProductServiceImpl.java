package com.eshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshopping.dto.ProductDto;
import com.eshopping.model.Product;
import com.eshopping.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product saveProduct(ProductDto productDto) {

		Product ProductData = new Product();

		ProductData.setProductName(productDto.getProductName());
		ProductData.setProductQty(productDto.getProductQty());
		ProductData.setPrice(productDto.getPrice());
		return productRepository.save(ProductData);

	}

	@Override
	public List<Product> getProductDetails() {
		
		List<Product> getProductData=productRepository.findAll();
		return getProductData;
	}

}
