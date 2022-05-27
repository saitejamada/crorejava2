<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Details</h1>
<table border="5px">
<tr>
<th>StudentId</th>
<th>StudentName</th>
<th>Studentcourse</th>
<th>Studentaddress</th>
</tr>
<c:forEach var="e" items="${stud}">
<tr>
<td>${e.sid}</td>
<td>${e.name}</td>
<td>${e.course}</td>
<td>${e.address}</td>
</tr>
</c:forEach>
</table>

</body>
</html>