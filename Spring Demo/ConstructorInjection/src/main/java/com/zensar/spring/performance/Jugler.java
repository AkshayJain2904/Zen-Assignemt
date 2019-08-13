package com.zensar.spring.performance;
/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 04.18PM
 * Modified Date:-27th July 2019 04.18AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is used to represent jugler.
 * Jugler gets bean bags using constructor injection
 * */

public class Jugler implements Performer {

	private int beanBags;
	
	public Jugler() {
		System.out.println("no-arg constructor");
	}
	public Jugler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("hii");
	}

	//business logic methode of perfromer
	public void perform() {
		System.out.println("Jugler juglling"+beanBags);

	}

}
