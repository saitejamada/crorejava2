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
<h1>Displaying All Books</h1>
<table border=5px>
<tr>
<th>bookId</th>
<th>bookName</th>
<th>bookPrice</th>
<th>bookAuthour</th>
</tr>
<c:forEach var="book" items="${allbooks}">
<tr>
<td>${book.bid}</td>
<td>${book.bookname}</td>
<td>${book.price}</td>
<td>${book.authourname}</td>
</tr>
</c:forEach>
</table>
</body>
</html>