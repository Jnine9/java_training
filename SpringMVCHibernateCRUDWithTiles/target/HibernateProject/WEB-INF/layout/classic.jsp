<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
  <head>
 	
  </head>
  <body>
  <div class="wrapper">
  	<div class="header"><tiles:insertAttribute name="header"/></div>
  	<div class="container">
  		<div class="menu"><tiles:insertAttribute name="menu"/></div>
  		<div class="body"><tiles:insertAttribute name="body"/></div>
  	</div>
  	<div class="footer"><tiles:insertAttribute name="footer"/></div>
  </div>
  </body>
</html>