package com.db.entity;

public class ShopAddress {
	
	private String number;
	private String postCode;
	private Double longitude;
	private Double latitude;
	
	
	public ShopAddress() {
	};
	public ShopAddress(String number, String postCode) {
		super();
		this.number = number;
		this.postCode = postCode;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
