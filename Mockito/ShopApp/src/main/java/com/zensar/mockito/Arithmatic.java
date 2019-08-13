package com.zensar.mockito;

public class Arithmatic {

	private Calucator calucator;
	
	public Arithmatic() {
		// TODO Auto-generated constructor stub
	}

	public Arithmatic(Calucator calucator) {
		super();
		this.calucator = calucator;
	}
	
	public int addition(int x,int y) {
		return calucator.add(x, y);
	}
}
