<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#super{display:flex}
*{font-size:20px}
</style>
</head>
<body>
<div id="super">
<div><img src="img/trainlogo.png"></div>
<div><form action="Loginservlet" method="post"><a href="Login.jsp"><button>Login</button></a></form></div>
<div><form action="Registerservlet" method="post"><a href="Register.jsp"><button>Register</button></a></form></div>
</div>
<img src="img/body.jpg">

</body>
</html>