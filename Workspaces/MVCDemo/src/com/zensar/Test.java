package com.zensar;


public class Test {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmpId(115);
		employee.setName("Raju");
		employee.setSalary(9784);
	EmployeeDAO employeeDAO=new EmployeeDAO();
	employeeDAO.createConnection();
	employeeDAO.addEmployee(employee);
	System.out.println("\t"+employeeDAO.getAllEmployees().toString()+"\t");
	}

}
