package com.zensar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private Connection connection;
	public Connection createConnection() {
		try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("driver loaded");
				 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","root");
				System.out.println("connection established");
				
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		
		return null;
		
	}
	public int addEmployee(Employee employee) {
		PreparedStatement pStatement;
		int result=0;
		try {
			pStatement = connection.prepareStatement("insert into employee values(?,?,?)");
			pStatement.setInt(1,employee.getEmpId());
			pStatement.setNString(2,employee.getName());
			pStatement.setDouble(3, employee.getSalary()); 
			result=pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Record inserted");
		return result;
	}
	public List<Employee> getAllEmployees() {
		List<Employee> list=new ArrayList<Employee>();
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from employee");
			
			while (resultSet.next()) {
				Employee employee=new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getDouble(3));
				list.add(employee);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	 
}
