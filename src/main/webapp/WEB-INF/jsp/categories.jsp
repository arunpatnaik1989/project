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
<form:form class="form-horizontal" method="post" action="categories"	commandName="CategoriesDetails" >
CATEGORIES ID:<br>
<form:input path="categoriesId"/><br>
CATEGORIES NAME:<br>
<form:input path="categoriesName"/><br>
CATEGORIES DESCRIPTION:<br>
<form:input path="categoriesDescription"/><br>
<br>
<input type="submit" value="Add">
</form:form>
</body>
</html>