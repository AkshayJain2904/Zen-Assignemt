package com.zensar.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("anniversary")
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		System.out.println("AnniversaryGreeting");
	}
	public String sayGreeting() {
		return "Happy anniversary....................";
	}

}
