package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		System.out.println("Festival Greeting created");
	}
	public String sayGreeting() {
		return "Happy Diwali...........";
	}

}
