<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.er{
color:red;
}
</style>
</head>
<body>
<form:form action="addEmp" modelAttribute="emp">
EmpId:: <form:input path="empId"/><br>
EmpName:: <form:input path="ename"/><br>
<form:errors path="empId" cssClass="er"/>
<form:errors path="ename" cssClass="er"/>

<input type="submit" value="Submit">
</form:form>
</body>
</html>