package com.zensar;

public class Manager extends Employee
{
	
	private double bs=getBasicSalary();
	private double pa=0.08*bs;
	private double fa=0.12*bs;
	private double oa=0.04*bs;
	private double gs;
	private double ns;
	private double pf=0.125*bs;
	
	public Manager() {
		super();
	}
	public Manager(int empid, String name, double basicSalary) {
		super(empid,name,basicSalary);
	}
	public void GrossSalaryM() 
	{
		gs=bs+pa+fa+oa;
	}
	public void NetSalaryM() 
	{
		ns=gs-pf;
	}
	public void display()
	{
		System.out.println("Gross Salary of manager is"+(bs+pa+fa+oa)+" and net salary is"+(gs-pf));
	}
	
	
}
