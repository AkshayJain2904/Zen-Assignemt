package com.zensar.spring.poems;
/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 04.18PM
 * Modified Date:-27th July 2019 04.18AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It represent a poem.
 * */
public class Twinkle implements Poem {
		
	private final static String Lines[]= {"Twinkle, twinkle, little star, \r\n" , 
			"How I wonder what you are! " , 
			"Up above the world so high, " , 
			"Like a diamond in the sky. "
			};
	
	public void recite() {
		for (String string : Lines) {
			System.out.println(string);
		}

	}

}
