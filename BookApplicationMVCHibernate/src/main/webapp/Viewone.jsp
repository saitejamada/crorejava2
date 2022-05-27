<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Single Book Details</h1>
<table border=5px>
<tr>
<th>bookId</th>
<th>bookName</th>
<th>bookPrice</th>
<th>bookAuthour</th>
</tr>
<tr>
<td>${book.bid}</td>
<td>${book.bookname}</td>
<td>${book.price}</td>
<td>${book.authourname}</td>
</tr>
</table>
</body>
</html>