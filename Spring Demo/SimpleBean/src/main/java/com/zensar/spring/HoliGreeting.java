package com.zensar.spring;

/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 12.49PM
 * Modified Date:-27th July 2019 12.49AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is specialized greeting used to great anybody on holi.
 * */
public class HoliGreeting implements Greeting {

	public HoliGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("HoliGreetings created");
	}
	
	public String sayGreeting() {
		return "Happy Holi";
	}

}
