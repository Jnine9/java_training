<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body style="text-align:center;">
  <font color="red"> ${SPRING_SECURITY_LAST_EXCEPTION.message} </font>
  <form method="post"
    action="${pageContext.request.contextPath}/logins"
   >
    <div class="table-responsive">
      <table class="table table-bordered" style="width: 500px">
        <tr>
          <td>User Name :</td>
          <td><input type="text" name="username" /><br></td>
        </tr>
        <tr>
          <td>Passowrd :</td>
          <td><input type="text" name="password" /><br></td>
        </tr>
        <tr>
          <td></td>
          <td><input class="btn btn-primary btn-sm" name="addData"
            type="submit" value="Login" /></td>
        </tr>
      </table>
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </div>
  </form>
  
</body>
</html>