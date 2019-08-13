package com.zensar.services.business;

import java.util.List;

import com.zensar.entites.Product;

/*
 * Author:-Akshay Jain
 * Creation date:-30th July 2019 4.52AM
 * Modified Date:-30th July 2019 4.52AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Represent product service.
 * */
public interface ProductService {
	void createProduct(Product product);
	void editProduct(Product product);
	void removeProduct(Product product);
	Product findbyProduct(int productId);
	List<Product> findAllProducts();
}
