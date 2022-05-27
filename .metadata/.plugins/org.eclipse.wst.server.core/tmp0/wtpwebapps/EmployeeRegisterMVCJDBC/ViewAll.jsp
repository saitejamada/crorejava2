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
<h1>Employee Details</h1>
<table border="5px">
<tr>
<th>EmpId</th>
<th>EmpName</th>
<th>EmpSalary</th>
<th>EmpDesignation</th>
</tr>
<c:forEach var="e" items="${view}">
<tr>
<td>${e.eid}</td>
<td>${e.name}</td>
<td>${e.salary}</td>
<td>${e.designation}</td>
</tr>
</c:forEach>
</table>

</body>
</html>