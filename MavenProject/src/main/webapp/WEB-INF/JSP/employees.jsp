<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String id = "", name = "", age = "", dept = "";
	if(request.getAttribute("nullData") != null){
		@SuppressWarnings("unchecked")
		HashMap<String, String> map  = (HashMap<String, String>)request.getAttribute("nullData");
		
		id = map.containsKey("id") ? map.get("id") : "";
		name = map.containsKey("name") ? map.get("name") : "";
		age = map.containsKey("age") ? map.get("age") : "";
		dept = map.containsKey("dept") ? map.get("dept") : "";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Data</title>
<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<style>
			.wrapper{
				margin: 50px auto;
				width: fit-content;
			}
		</style>
</head>
<body> 
	<div class="wrapper">
		<h3>Add / Edit Employee!!!</h3>

		<form:form method="post" action="${pageContext.request.contextPath}/employee"
				modelAttribute="employee">
				<div class="table-responsive">
						<table class="table table-bordered" style="width: 300px">
								<tr>
										<td>Id :</td>
										<td><form:input type="number" path="id"/><br><%=id %></td>
								</tr>
								<tr>
										<td>Name :</td>
										<td><form:input type="text" path="name"/><br><%=name %></td>
								</tr>
								<tr>
										<td>Age :</td>
										<td><form:input type="number" path="age"/><br><%=age %></td>
								</tr>
								<tr>
										<td>Department :</td>
										<td><form:input type="text" path="dept"/><br><%=dept %></td>
								</tr>
								<tr>
										<td></td>
										<td><input class="btn btn-primary btn-sm" type="submit"
												value="Submit" /></td>
								</tr>
						</table>
				</div>
		</form:form>
		<br>
		<h3>List of Employees</h3>
		<table class="table table-bordered" style="width: 300px">
				<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Age</th>
						<th>Department</th>
						<th>Edit/Delete</th>
				</tr>
				<c:forEach items="${employeeList}" var="employee">
						<tr>
								<td width="60" align="center">${employee.id}</td>
								<td width="60" align="center">${employee.name}</td>
								<td width="60" align="center">${employee.age}</td>
								<td width="60" align="center">${employee.dept}</td>
								<td width="60" align="center"><a href="${pageContext.request.contextPath}/edit/${employee.id}">Edit</a>/<a
										href="${pageContext.request.contextPath}/delete/${employee.id}">Delete</a></td>
						</tr>
				</c:forEach>
		</table>
		</div>
</body>
</html>