package com.zensar;

public class Product implements Cloneable {
	private int product_id;
	private String product_name;
	private double cost_of_product;
	
	
	public Product() {
		super();
	}
	public Product(int product_id, String product_name, double cost_of_product) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.cost_of_product = cost_of_product;
	} 
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", cost_of_product="
				+ cost_of_product + "]";
	}
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost_of_product);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + product_id;
		result = prime * result + ((product_name == null) ? 0 : product_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost_of_product) != Double.doubleToLongBits(other.cost_of_product))
			return false;
		if (product_id != other.product_id)
			return false;
		if (product_name == null) {
			if (other.product_name != null)
				return false;
		} else if (!product_name.equals(other.product_name))
			return false;
		return true;
	}
	public static void main(String args[]) 
	{
		Product product=new Product(111, "Cooler", 11245);
		Product product2=new Product(111, "Cooler", 11245);
		if(product.equals(product2))
			System.out.println("same");
		else {
			System.out.println("not same");
		}
		System.out.println("hash code are");
		System.out.println(product.hashCode());
		System.out.println(product2.hashCode());
	
		System.out.println("clone");
		try
		{
		Product product3=new Product(111, "Cooler", 11245);
		Product product4=(Product)product.clone();
		System.out.println(product.product_id+" "+product.product_name+" "+product.cost_of_product);
		System.out.println(product2.product_id+" "+product2.product_name+" "+product2.cost_of_product);
		System.out.println(product3.hashCode());
		System.out.println(product4.hashCode());
		}
		catch(CloneNotSupportedException c){}

	}
	
	
	

}
