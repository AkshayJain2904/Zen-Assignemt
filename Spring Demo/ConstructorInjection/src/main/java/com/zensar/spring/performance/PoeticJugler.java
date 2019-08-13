package com.zensar.spring.performance;

import com.zensar.spring.poems.Poem;

/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 04.50PM
 * Modified Date:-27th July 2019 04.50AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Poem is injected in PoeticJugller
 * */

//dependent object class
public class PoeticJugler extends Jugler {
	
	//dependency object refrence
	private Poem poem;
	
	public PoeticJugler() {
		System.out.println("no-arg constructor of poeticjuggler");
	}

	public PoeticJugler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("parameter constructor");
	}

	@Override
	public void perform() {
		super.perform();
		System.out.println("while reciting a poem.............");
		poem.recite();
	}
	
	
}
