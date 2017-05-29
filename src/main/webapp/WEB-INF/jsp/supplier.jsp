<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form class="form-horizontal" method="post" action="supplier"	commandName="SupplierDetails" >
SUPPLIER ID:<br>
<form:input path="supplierId"/><br>
SUPPLIER NAME:<br>
<form:input path="supplierName"/><br>
SUPPLIER DESCRIPTION:<br>
<form:input path="supplierDescription"/><br>
<br>
<input type="submit" value="Add">
</form:form>
</body>
</html>