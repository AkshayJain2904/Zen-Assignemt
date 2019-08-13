package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entites.Product;
/*
 * Author:-Akshay Jain
 * Creation date:-30th July 2019 3.07AM
 * Modified Date:-30th July 2019 3.07AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Data Access Object Implementor.
 * */
@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(Product product) {
		String sql="insert into product values(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
		System.out.println("Record inserted");
	}

	public void update(Product product) {
		String sql="update product set name=?,brand=?,price=? where id=?";
		jdbcTemplate.update(sql,product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Record updated");
	}

	public void delete(Product product) {
		String sql="delete from product where id=?";
		jdbcTemplate.update(sql,product.getProductId());
		System.out.println("Record deletd");
	}

	public Product getById(int productId) {
		String sql="select * from product where id=?";
		Product product=jdbcTemplate.query(sql,new Object[] {productId}, new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next())
				{
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					return product;
				}
				else
				return null;
			}
		});
		return product;
	}

	public List<Product> getAll() {
		String sql="select * from product";
		List<Product> list=jdbcTemplate.query(sql,new ResultSetExtractor<List<Product>>() {

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> list=new ArrayList<Product>();
				while(rs.next())
				 {
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					list.add(product);
				}
				return list;
			}
		});
		
		return list;
	}

}
