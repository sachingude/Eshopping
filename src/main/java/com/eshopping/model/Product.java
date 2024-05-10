package com.eshopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product 
{
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String productName;
 private String productQty;
 private String price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductQty() {
	return productQty;
}
public void setProductQty(String productQty) {
	this.productQty = productQty;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Product(int id, String productName, String productQty, String price) {
	super();
	this.id = id;
	this.productName = productName;
	this.productQty = productQty;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
	
	
}
