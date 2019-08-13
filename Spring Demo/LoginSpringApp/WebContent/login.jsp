<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Shooping</title>
</head>
<body>
<h2>${loginerror}</h2>
	<form action="valid" method="post">
		UserName<input type="text" name="user"><br><br>
		Password<input type="password" name="password"><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>