<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="resources\css\navbar.css" rel="stylesheet">
<link href="resources\css\home.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
</head>
<body>

<ul>
  <li><a class="active" href="home">Home</a></li>
  <li><a href="login">Login</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>

<div >
<img class="imgHome" src="https://www.ifwcampuserp.com/images/modules/online-exam.jpg" width="100%" height="800">
 <div class="centered">Your destination for online examination!</div>
</div>

<!-- <div class="d-flex justify-content-around"> -->
<div class="admin" align=center>
<table align=center cellpadding=120px>
<tr><td>
<div class="d">
	<img class="imgLogo" src="https://image.flaticon.com/icons/png/512/4406/4406352.png" width="150" height="150">
	
	<form action="login" method="post">
	<p align="center">ADMIN</p>
		<button class="button">Login</button>
	</form>
</div></td>
<td><div class="b">
	<img class="imgLogo" src="https://image.flaticon.com/icons/png/512/3410/3410142.png" width="150" height="150">
	<p align="center">FACULTY</p>
	<form action="login" method="post">
		<button class="button">Login</button>
	</form>
	</div></td>
<td><div class="c">	
	<img class="imgLogo" src="https://image.flaticon.com/icons/png/512/3135/3135755.png" width="150" height="150">
	<p align="center">STUDENT</p>
	<form action="login" method="post">
		<button class="button">Login</button>
	</form>
</div></td>	</tr>
</table>
</div>
<div>
<footer>
  <p>Copyrights @oes2021<br><br>
  <a href="mailto:oes@example.com">oes@gmail.com</a></p>
</footer>
</div>
</body>
</html>