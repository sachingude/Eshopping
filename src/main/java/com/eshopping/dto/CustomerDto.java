package com.eshopping.dto;

public class CustomerDto {

	private String custName;
	private String address;
	private String email;
    private String phoneNumber;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public CustomerDto(String custName, String address, String email, String phoneNumber) {
		super();
		this.custName = custName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CustomerDto [custName=" + custName + ", address=" + address + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
    
    
	
	
}
