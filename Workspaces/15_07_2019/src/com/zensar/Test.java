package com.zensar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

public static String getFlavorOfMaxPrice(List<Icecream> icecreams ) {
		double max=0;
		String name="";
		for (int i=0;i<icecreams.size(); i++) {
			if(icecreams.get(i).getPrice()>max)
			{
				max=icecreams.get(i).getPrice();
				name=icecreams.get(i).getFlavour();
			}
		}
		return name;
	}
	public static double calculateCustomerBill(List<Icecream> icecreams )
	{
		double price=0;
		for (Icecream icecream : icecreams) {
			price+=icecream.getDiscount();
		}
		return price;
	}
	
	public static void main(String[] args) {
		List<Icecream> listIcecreams=new ArrayList<Icecream>();
		listIcecreams.add(new Icecream("chocolate", 12));
		listIcecreams.add(new Icecream("almond", 34));
		listIcecreams.add(new Icecream("pista", 17));
		listIcecreams.add(new Icecream("vanila", 118));
		System.out.println("Total price is:-"+calculateCustomerBill(listIcecreams));
		System.out.println("flavour of icecream with maximum price is:-"+getFlavorOfMaxPrice(listIcecreams));
	
	}
	

}
