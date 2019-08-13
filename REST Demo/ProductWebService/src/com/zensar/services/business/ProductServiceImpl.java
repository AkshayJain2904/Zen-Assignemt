package com.zensar.services.business;

import java.util.ArrayList;
import java.util.List;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entites.Product;
/*
 * Author:-Akshay Jain
 * Creation date:-25th July 2019 5.55PM
 * Modified Date:-26th July 2019 10.00AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is business object of application interface.
 * It focuses on business logic of Product.
 * */
public class ProductServiceImpl implements ProductServices {
	
	private ProductDao dao;
	
	
	public ProductServiceImpl() {
		super();
		dao=new ProductDaoImpl();
	}

	@Override
	public void create(Product product) {
		
		dao.insert(product);

	}

	@Override
	public void edit(Product product) {
		Product product2=findProductbyId(product.getProductId());
		if(product2!=null)
		{
			product2.setName(product.getName());
			product2.setBrand(product.getBrand());
			product2.setPrice(product.getPrice());
			dao.update(product2);
		}
		else {
			System.out.println("Product not found");
		}
	}

	@Override
	public void remove(Product product) {
		Product product2=findProductbyId(product.getProductId());
		if(product2!=null)
		{
			dao.delete(product2);
		}
		else {
			System.out.println("Product not exist");
		}
	}

	@Override
	public Product findProductbyId(int productId) {
		return dao.getById(productId);
	}

	@Override
	public List<Product> findAllProduct() {
		return dao.getAll();
	}

	@Override
	public int getProductCount() {
		return findAllProduct().size();
	}

	@Override
	public List<Product> findProductByBrands(String brand) {
		List<Product> list=findAllProduct();
		List<Product> list2=new ArrayList<>();
		for (Product product : list) {
			if(product.getBrand().equals(brand))
			{
				list2.add(product);
			}
		}
		return list;
	}

	@Override
	public List<Product> findProductByPrice(double minPrice, double maxPrice) {
		List<Product> list=findAllProduct();
		List<Product> list2=new ArrayList<>();
		for (Product product : list) {
			if(product.getPrice()>=minPrice &&product.getPrice()<=maxPrice)
			{
				list2.add(product);
			}
		}
		return list2;
	}

}
