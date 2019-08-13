package com.zensar;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	private String name;
	private double salary;
	/*
	 * @OneToMany private List<Laptop> laptop=new ArrayList<>();
	 */
	
	/*
	 * @OneToOne private Laptop laptop;
	 */
	
	/* private Address address; */
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

	/*
	 * public Laptop getLaptop() { return laptop; } public void setLaptop(Laptop
	 * laptop) { this.laptop = laptop; }
	 */

	/*
	 * public List<Laptop> getLaptop() { return laptop; } public void
	 * setLaptop(List<Laptop> laptop) { this.laptop = laptop; }
	 */
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary
				+ /* ", address=" + address + */ "]";
	}
	
	
}
