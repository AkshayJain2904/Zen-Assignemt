package com.zensar;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;;

@Entity
public class Laptop {
	@Id
	private int id;
	private String manufacturer;
	
	@ManyToOne
	private Employee employee;
	
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	

}
