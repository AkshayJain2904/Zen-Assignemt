package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.entites.Product;
/*
 * Author:-Akshay Jain
 * Creation date:-30th July 2019 3.07PM
 * Modified Date:-31th July 2019 10.39AM
 * Version:2.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Data Access Object Implementor.
 * */
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insert(Product product) {
		hibernateTemplate.save(product);
	}

	public void update(Product product) {
		hibernateTemplate.update(product);		
	}

	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}

	public Product getById(int productId) {
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		return hibernateTemplate.loadAll(Product.class);
	}
	
}