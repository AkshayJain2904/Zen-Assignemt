package com.zensar.dao;

import java.util.List;

import com.zensar.entites.Product;
/*
 * Author:-Akshay Jain
 * Creation date:-30th July 2019 3.07AM
 * Modified Date:-30th July 2019 3.07AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Data Access Object Interface.
 * */
public interface ProductDao {
	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
