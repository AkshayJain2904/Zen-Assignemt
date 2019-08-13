package com.zensar.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/*
 * Author:-Akshay Jain
 * Creation date:-26th July 2019 10.00AM
 * Modified Date:-26th July 2019 10.00AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Data Access Object Interface.
 * It is used to access Product data from database
 * */
@XmlRootElement
@XmlType(propOrder = {"productId","name","brand","price"})
@Entity
@Table(name = "PRODUCT")

public class Product {
	@Id
	//@GeneratedValue
	@Column(name = "ID")
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
