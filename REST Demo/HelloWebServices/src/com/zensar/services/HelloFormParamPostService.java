package com.zensar.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
@Path("/productaddservice")
public class HelloFormParamPostService {
	@POST
	@Path("/add")
	@Produces("text/html")
	public Response addProduct(@FormParam("id")int id,@FormParam("name")String productName,@FormParam("price")double price)
	{
		return Response.status(200).entity("<p>Product added Succesfully<br>Product id:-"+id+"<br>Name:-"+productName+"<br>Price:-"+price+"</p>").build();
	}
}
