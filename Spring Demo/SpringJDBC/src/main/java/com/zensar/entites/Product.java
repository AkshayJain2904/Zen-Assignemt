package com.zensar.entites;

import org.springframework.stereotype.Component;

/*
 * Author:-Akshay Jain
 * Creation date:-23th July 2019 10.00AM
 * Modified Date:-30th July 2019 3.07AM
 * Version:3.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-POJO class.
 * It is used to access Product data from database
 * */
@Component
public class Product {

	private int productId;
	private String name;
	private String brand;
	private double price;
	
	public Product() {
		super();
	}

	public Product(int productId, String name, String brand, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
