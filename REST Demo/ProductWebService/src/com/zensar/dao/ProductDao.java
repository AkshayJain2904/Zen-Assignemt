package com.zensar.dao;

import java.util.List;

import com.zensar.entites.Product;
/*
 * Author:-Akshay Jain
 * Creation date:-25th July 2019 5.55PM
 * Modified Date:-26th July 2019 10.00AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is persistent class of hibernate.
 * It is also POJO.
 * */
public interface ProductDao {
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();

}
