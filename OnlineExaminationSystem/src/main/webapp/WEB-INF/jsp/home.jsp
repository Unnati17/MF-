<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources\css\navbar.css" rel="stylesheet">
<link href="resources\css\home.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
</head>
<body>

<div class="navbar">
 <a href="contact">Contact</a>
  <a href="about">About</a>
 <a href="home">Home</a>
<!--  <a href="register">Register</a> -->
    </div> 
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
	<p class="para" align="center">ADMIN</p>
		<button class="button">Login</button>
	</form>
</div></td>
<td><div class="b">
	<img class="imgLogo" src="https://image.flaticon.com/icons/png/512/3410/3410142.png" width="150" height="150">
	<p class="para" align="center">FACULTY</p>
	<form action="loginFaculty" method="post">
		<button class="button" >Login</button>
	</form>
	</div></td>
<td><div class="c">	
	<img class="imgLogo" src="https://image.flaticon.com/icons/png/512/3135/3135755.png" width="150" height="150">
	<p class="para" align="center">STUDENT</p>
	<form action="loginStudent" method="post">
		<button class="button" >Login</button>
	</form>
</div></td>	</tr>
</table>
</div>
<div>
<footer style="position:relative;">
  <p>Copyright @oes2021<br>
  <a class="af" href="mailto:oes@example.com">oes@gmail.com</a></p>
</footer>
</div>
</body>
</html>