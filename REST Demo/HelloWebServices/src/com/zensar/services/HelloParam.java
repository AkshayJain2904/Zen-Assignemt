package com.zensar.services;
import java.time.LocalDate;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
@Path("/zenparam")
public class HelloParam {
	@Path("/welcome/{nm}")
	@GET
	@Produces("text/html")
	public Response getMessage(@PathParam ("nm")String name)
	{
		return Response
				.status(200)
				.entity("<p> Hello<b><i> "+ name+ "Welcome to zensar for hello service</p>")
				.build();
	}
	
	
	
	@Path("/birthday/{nm}/{mn}/{mp}")
	@GET
	@Produces("text/html")
	public Response getMessage(@PathParam ("nm")int day,@PathParam ("mn")int month,@PathParam ("mp")int year)
	{
		LocalDate date=LocalDate.of(year,month,day);
		return Response
				.status(200)
				.entity("<p> Birthday<b><i> "+ date+"</p>")
				.build();
	}

}
