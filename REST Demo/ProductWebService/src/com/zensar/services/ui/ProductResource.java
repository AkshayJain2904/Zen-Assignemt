package com.zensar.services.ui;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.zensar.entites.Product;
import com.zensar.services.business.ProductServiceImpl;
import com.zensar.services.business.ProductServices;

/*
 * Author:-Akshay Jain
 * Creation date:-25th July 2019 5.55PM
 * Modified Date:-26th July 2019 10.00AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-Product web services.
 * RESTful web services.
 * */

@Path("/product")
public class ProductResource {
	private ProductServices productServices;
	
	
	public ProductResource() {
		super();
		productServices=new ProductServiceImpl();
	}

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts() {
		
		return productServices.findAllProduct();	
	}
	@Path("/{id}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getProduct(@PathParam("id") int productId) {
		Product product=productServices.findProductbyId(productId);
		if(product!=null)
		{
			return Response.status(200).entity(product.toString()).build();
		}
		else {
			return Response.status(200).entity("Product Id"+productId+"not found").build();
		}
	}
	@GET
	@Path("/products/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Product getProductById(@PathParam("id")int productId) {
		return productServices.findProductbyId(productId);
	}
	@Path("/count")
	@GET
	@Produces("text/plain")
	/*public Response getProductByCount() {
		return Response.status(200).entity(productServices.getProductCount()).build();
		
	}*/
	public String getProductCount()
	{
		return "No. of products"+productServices.getProductCount();
	}
	@Path("/delete/{id}")
	@DELETE
	@Produces("text/plain")
	public String removeProduct(@PathParam("id")int id) {
		Product product=productServices.findProductbyId(id);
		if(product!=null)
		{
			productServices.remove(product);
			return "Product"+id;
		}
		return "Product"+id+"not exist";
	}
	
}
