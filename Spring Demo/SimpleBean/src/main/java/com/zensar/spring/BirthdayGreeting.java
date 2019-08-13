package com.zensar.spring;

/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 12.49PM
 * Modified Date:-27th July 2019 12.49AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is specialized greeting used to great anybody on birthday.
 * */
public class BirthdayGreeting implements Greeting{
	
	public BirthdayGreeting() {
		super();
		System.out.println("birthday greetings created");
	}



	public String sayGreeting() {
		return "Happy birthday";
	}

}
