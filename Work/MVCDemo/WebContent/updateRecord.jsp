<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.zensar.Employee"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> list=(List<Employee>)session.getAttribute("list"); %>
<%
int id = Integer.parseInt(request.getParameter("empId"));
Employee res = null;
for(Employee emp : list){

	if(emp.getEmpId()==id)
		res=new Employee(id,emp.getName(),emp.getSalary());
		
	}
%>

	<form action="update">
			<table>
				<tr>
					<td>EmpId</td>
					<td><input type="number" name="empId" value='<%= res.getEmpId() %>'></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value='<%= res.getName() %>'></td>
				</tr>
				<tr>
					<td>salary</td>
					<td><input type="number" name="salary" value='<%= res.getSalary() %>'></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"></td>
					
				</tr>
			</table>
	</form>
</body>
</html>