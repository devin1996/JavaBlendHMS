<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<%
		String userName = request.getParameter("userName");
	String pwd = request.getParameter("password");

	out.println("Welcome " + userName + "! Your New Password is " + pwd);
	%>
</body>
</html>