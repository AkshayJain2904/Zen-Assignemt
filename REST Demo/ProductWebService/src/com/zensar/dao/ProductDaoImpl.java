package com.zensar.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entites.Product;
/*
 * Author:-Akshay Jain
 * Creation date:-26th July 2019 10.00AM
 * Modified Date:-26th July 2019 10.00AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Data Access Object implementor class.
 * Uses hibernate API to access data.
 * */
public class ProductDaoImpl implements ProductDao {
	private Session session;
	
	public ProductDaoImpl() {
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}
	
	
	@Override
	public void insert(Product product) {
		Transaction txTransaction=session.beginTransaction();
		session.save(product);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();
	}

	@Override
	public void update(Product product) {
		Transaction txTransaction=session.beginTransaction();
		session.update(product);
		txTransaction.commit();
		System.out.println("Record updated ");
	}

	@Override
	public void delete(Product product) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(product);
		txTransaction.commit();
		System.out.println("deleted");
	}

	@Override
	public Product getById(int productId) {
		return session.get(Product.class,productId);
	}

	@Override
	public List<Product> getAll() {
		Query query=session.createQuery("from Product");
		return query.getResultList();
	}



}