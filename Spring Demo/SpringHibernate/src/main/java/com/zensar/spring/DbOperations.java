package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.entites.Product;
import com.zensar.services.business.ProductService;

public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dbconfig.xml");
        ProductService productService=applicationContext.getBean("productServiceImpl",ProductService.class);
        Product product=new Product(1005,"HJ","fds",5353); 
        productService.createProduct(product);
        //System.out.println(productService.findbyProduct(1002));
        
        
        //Product product2=new Product(1002, "Laptop", "HP", 3637);
        //productService.editProduct(product2);
        
		/*
		 * Product product3=new Product(); product3.setProductId(1002);
		 * productService.removeProduct(product3);
		 */
        
        System.out.println("\n"+productService.findAllProducts()+"\n");
    }
}
