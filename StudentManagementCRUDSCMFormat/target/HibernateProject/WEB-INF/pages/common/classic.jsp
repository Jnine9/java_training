<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
</head>
<body>
  <div class="wrapper">
    <div class="header">
      <tiles:insertAttribute name="header" />
    </div>
    <div class="container">
      <div class="menu clearfix">
        <tiles:insertAttribute name="menu" />
      </div>
      <div class="body">
        <tiles:insertAttribute name="body" />
      </div>
    </div>
    <div class="footer">
      <tiles:insertAttribute name="footer" />
    </div>
  </div>
</body>
</html>