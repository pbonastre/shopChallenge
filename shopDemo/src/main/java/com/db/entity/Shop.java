package com.db.entity;


public class Shop {

	private String name;
	private ShopAddress shopAddress;

	public Shop() {
	};


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShopAddress getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
	}

}
