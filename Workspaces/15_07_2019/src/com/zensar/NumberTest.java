package com.zensar;

import java.util.ArrayList;
import java.util.List;

public class NumberTest {

	public static void main(String[] args) {
		double average=0,total=0;
		List<Double> list=new ArrayList<>();
		list.add(16.25);
		list.add(25.70); 
		list.add(45.85);
		list.add(35.5);
		list.add(12.25);
		
		for (Double double1 : list) {
			total+=double1;
			average=(total/(list.size()));
		}
		System.out.println(average);
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>12.0 && list.get(i)<40.0)
			{
				list.set(i,list.get(i)+2.5);
			}
		}
		System.out.println(list);
		
		/*
		 * for (Double double1 : list) { if(double1>12.0 && double1<40.0) {
		 * double1+=2.5; list.set(list.indexOf(double1),double1); } }
		 */
		  //System.out.println(list);
		 
	}

}
