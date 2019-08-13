package com.zensar.spring.instruments;
/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 05.30PM
 * Modified Date:-29th July 2019 02.45AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is used to play instrument.
 * */
public class Gitar implements Instrument {

	public void play() {
		System.out.println("ting ting ting...");
	}

	public void tune() {
		System.out.println("Guitar is tuned");
		
	}

	public void clean() {
		System.out.println("Guitar is clean");
		
	}

}
