<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<%@ include file="userHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="register"	commandName="RegisterDetails" >
ENTER USERID:<br>
<form:input path="userId"/><br>
ENTER USERNAME:<br>
<form:input path="userName"/><br>
ENTER FULLNAME:<br>
<form:input path="fullName"/><br>
ENTER PASSWORD:<br>
<form:password path="password"/><br>
ENTER EMAIL:<br>
<form:input path="email"/><br>
ENTER MOBILENO:<br>
<form:input path="mobile"/><br>
<br>
<input type="submit" value="Register">
</form:form>
</body>
</html>