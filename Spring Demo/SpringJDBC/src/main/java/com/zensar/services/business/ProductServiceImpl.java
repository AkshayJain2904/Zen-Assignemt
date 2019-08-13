package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ProductDao;
import com.zensar.entites.Product;

/*
 * Author:-Akshay Jain
 * Creation date:-30th July 2019 4.57AM
 * Modified Date:-30th July 2019 4.57AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Represent product service implementor class.
 * */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao dao;

	public void createProduct(Product product) {
		dao.insert(product);

	}

	public void editProduct(Product product) {
		Product product2=findbyProduct(product.getProductId());
		product2.setName(product.getName());
		product2.setBrand(product.getBrand());
		product2.setPrice(product.getPrice());
		dao.update(product2);

	}

	public void removeProduct(Product product) {
		Product product2=findbyProduct(product.getProductId());
		if(product2!=null)
		{
			dao.delete(product2);
		}
		else {
			System.out.println("Product doesn't exist");
		}
	}

	public Product findbyProduct(int productId) {
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		return dao.getAll();
	}

}
