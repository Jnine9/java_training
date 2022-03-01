<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Managment</title>
<style>
body {
		text-align: center;
}
</style>
</head>
<body>
		<h2>Student Managment</h2>
		<a href="<%=path%>/students">Student</a>
</body>
</html>