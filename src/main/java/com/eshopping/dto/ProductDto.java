package com.eshopping.dto;

public class ProductDto {
	
	 private String productName;
	 private String productQty;
	 private String price;
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
	@Override
	public String toString() {
		return "ProductDto [productName=" + productName + ", productQty=" + productQty + ", price=" + price + "]";
	}
	public ProductDto(String productName, String productQty, String price) {
		super();
		this.productName = productName;
		this.productQty = productQty;
		this.price = price;
	}
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
