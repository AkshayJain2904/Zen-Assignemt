package com.zensar.view;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.zensar.Address;
import com.zensar.Employee;
import com.zensar.Laptop;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class Test {

	public static void main(String[] args) {
		
		
		 
		Laptop laptop=new Laptop();
		laptop.setId(5);
		laptop.setManufacturer("Dell");
		 
		
		Laptop laptop2=new Laptop();
		laptop2.setId(6);
		laptop2.setManufacturer("HP");
		
		Employee emp1 = new Employee(); 
		 emp1.setEmpId(119);
		 emp1.setName("Sam");
		 emp1.setSalary(7845);
		 
		 laptop.setEmployee(emp1);
		 laptop2.setEmployee(emp1);
		 //emp1.getLaptop().add(laptop2);
		 
		 
		 /*
		 * emp.setLaptop(laptop);
		 */
		 
		 /*
		 * Address address = new Address(); address.setArea("Hadapsar");
		 * address.setCity("Pune");
		 */
		
		/*
		 * Employee emp = new Employee(); emp.setEmpId(105); emp.setName("Pick");
		 * emp.setSalary(50000);
		 */
		/* emp.setAddress(address); */
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp1);
		session.save(laptop);
		session.save(laptop2);
		
		
		/*
		 * Query query=session.createQuery("from Employee");//select * from emp
		 * List<Employee> list=query.getResultList();
		 */
		session.getTransaction().commit();
		session.close();
		/*
		 * for(Employee e:list) { System.out.println(e); }
		 */
	}
}

