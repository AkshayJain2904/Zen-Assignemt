package com.phonix.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class HelloClient {

	public static void main(String[] args) {
		URI uri=UriBuilder.fromUri("http://localhost:8056/HelloWebServices/zenrest").build();
		ClientConfig clientConfig=new ClientConfig();
		Client client=ClientBuilder.newClient(clientConfig);
		
		WebTarget webTarget=client.target(uri);
		String plain=webTarget.path("/zenhello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		System.out.println(plain);
		
		String plain1=webTarget.path("/zenhello/welcome").request().accept(MediaType.TEXT_HTML).get(String.class);
		System.out.println(plain1);
		
		String plain2=webTarget.path("/zenhello/welcomexml").request().accept(MediaType.TEXT_XML).get(String.class);
		System.out.println(plain2);
		
	}

}
