package com.zensar;

class TestOne extends Thread {
	    static int i=10;  
        @Override
        public void run() 
        { 
           increment(); 
           decrement(); 
        } 
       
	    public void increment() 
	    { 
	        for(int j=0;j<50;j++) 
	        { 
	                // incrementing value of i  
	            i=i+1; 
	            System.out.println("i after increment "+i); 
	        } 
	    } 
	    public void decrement() 
	    { 
	        for(int j=0;j<50;j++) 
	        { 
	                // decrementing value of i  
	            i=i-1; 
	            System.out.println("i after decrement "+i); 
	        } 
	    } 
	    
         
	} 
	  
public class ThreadInterferenceDemo { 
	    public static void main(String[] args) 
	    { 
	        final ThreadInterferenceDemo s1 = new ThreadInterferenceDemo();
	        Thread t1 = new Thread(); 
	        Thread t2 = new Thread();
	        t1.start(); 
	        t2.start(); 
           
	    } 
	} 


