<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{font-size:20px}
body{background-color:lightblue}
#su{height:200px;margin-top:150px;margin-left:150px;}
</style>
</head>
<body>
<div id="su">
<form action="Reg" method="post">
Enter Name::<input type="text" name="name"><br>
Enter MobileNumber::<input type="text" name="mbno"><br>
Enter age::<input type="text" name="age"><br>
Enter password::<input type="password" name="pass"><br>
<br>
<input type="submit" value="Register">
</form>
</div>
</body>
</html>