package com.zensar.spring.simple;

public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		System.out.println("Festival greeting created");
	}
	@Override
	public String sayGreet() {
		return "Happy Diwali............";
	}

}
