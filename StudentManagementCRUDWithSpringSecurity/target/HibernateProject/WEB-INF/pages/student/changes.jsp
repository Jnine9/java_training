<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<c:if test="${systemMessage != null}">
    <div class="message-field">
      <p>${systemMessage}</p><br>
      <c:if test="${changes != null }">
        <span>${changes }</span>
      </c:if>
    </div>
</c:if>
<h5 class="center"><a href="${pageContext.request.contextPath}/students">Go to manager</a></h5>
</body>
</html>