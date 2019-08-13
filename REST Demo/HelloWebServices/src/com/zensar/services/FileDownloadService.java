package com.zensar.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
@Path("/files")
public class FileDownloadService {
	private static final String FILE_PATH="D:\\REST Demo\\hello.txt";
	@GET
	@Path("/text")
	@Produces("text/plain")
	public Response getFile() 
	{
		File file=new File(FILE_PATH);
		ResponseBuilder responceBuilder=Response.ok(file);
		responceBuilder .header("Content-Disposition","attachment; filename=Hello.txt");
		return responceBuilder.build();
	}
	
	@GET
	@Path("/images")
	@Produces("image/png")
	public Response getImage(){
 
		File file=new File("D:\\myimage.jpg");
		ResponseBuilder responseBuilder = Response.ok(file);
		responseBuilder.header("Content-Disposition","attachment; filename=your_image.png");
		return responseBuilder.build();
	}

}
