package com.zensar.spring.performer;

import com.zensar.spring.instruments.Instrument;

/*
 * Author:-Akshay Jain
 * Creation date:-27th July 2019 05.30PM
 * Modified Date:-27th July 2019 05.30AM
 * Version:1.0
 * Copyright:-Zensar Technologies All rights reserved.
 * Description:-It is used to play instrumentalist.
 * */
public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;
	
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}
	//for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}

	//business logic of instrumentalist
	public void perfom() {
		System.out.println("Instrumentalist is playing"+song);
		instrument.play();

	}

}
