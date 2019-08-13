package com.zensar;

import java.util.Collections;

public class Icecream implements Comparable<Icecream>{
	private String flavour; //(e.g. vanilla, chocolate, pista, almond)
	private double price; 
	private double discount;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Icecream(String flavour, float price) {
		super();
		this.flavour = flavour;
		this.price = price;
	}
	
	public double getDiscount() {
		if(flavour=="chocolate")
		{
			discount=10.75;
			price-=discount;
			//System.out.println("discount is"+discount+"\t"+"Price after discout"+price);
			return price;
		}
		else {
			discount=5.25;
			price-=discount;
			//System.out.println("discount is"+discount+"Price after discout"+price);
			return price;
		}
		
	}

	@Override
	public String toString() {
		return "Icecream [flavour=" + flavour + ", price=" + price + ", discount=" + discount + "]";
	}

	@Override
	public int compareTo(Icecream o) {
		if(price>o.getPrice())
		{
			return 1;
		}
		else if(price<o.getPrice())
		{
			return -1;
		}
		else
		return 0;
		
	}
	
}
