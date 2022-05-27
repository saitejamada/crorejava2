<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Appilication</h1>
<form action="insert">
Enter Student ID ::<input type="text" name="sid"><br><br>
Enter Student Name ::<input type="text" name="sname"><br><br>
Enter Student Course ::<input type="text" name="scource"><br><br>
Enter Student Address ::<input type="text" name="sadd"><br><br>
<input type="submit" value="submit"> 
</form>
<br><br>
<form action="up">
<input type="submit" value="update">
</form>
<br><br>
<form action="del">
<input type="submit" value="delete">
</form>
<br><br>
<form action="vie">
<input type="submit" value="view">
</form>
<br><br>
<form action="viewall">
<input type="submit" value="viewALL">
</form>

</body>
</html>