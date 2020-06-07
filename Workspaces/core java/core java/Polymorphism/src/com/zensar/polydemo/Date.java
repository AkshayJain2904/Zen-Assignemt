package com.zensar.polydemo;

import java.awt.DisplayMode;

public class Date {
	private int dd,mm,yy;

	public Date() {
		dd=1;
		mm=1;
		yy=2000;
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	/*void display()
	{
		System.out.println();
	}
*/
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}