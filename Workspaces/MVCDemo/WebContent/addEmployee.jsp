<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addEmployee">
			<table>
				<tr>
					<td>EmpId</td>
					<td><input type="number" name="employeeId"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="employeename"></td>
				</tr>
				<tr>
					<td>salary</td>
					<td><input type="number" name="employeesal"></td>
				</tr>
				<tr>
					
					<td><input type="button" name="submit"></td>
				</tr>
			</table>
	</form>
</body>
</html>