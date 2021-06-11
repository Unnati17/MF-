<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<style >
body, html {
  height: 100%;
  margin: 0;
}
.bg {
  /* The image used */
  background-image: url("https://imagevars.gulfnews.com/2021/01/25/NAT-STOCK-ONLINE-EXAM-1611553324940_17738103f8d_large.jpg");
filter: blur(5px);
 
  /* Full height */
  height: 100%; 
opacity:0.7;
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
/* .footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: #333;
   color: white;
   font-size:20px;
   text-align: center;
}
a {
  color: #41BDA4;
}
a:hover{
	color:white;
} */
</style>

<title>The NorthCap University</title>
<link href="resources\css\loginRegister.css" rel="stylesheet">
<link href="resources\css\navbar.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
   
</head>
<body >
<ul>
  <li><a class="active" href="contact">Contact</a></li>
  
  <li><a href="#about">About</a></li>
  <li><a href="#home">Home</a></li>
</ul>
<div class="bg"></div>
<div class="bg-text" >
<h1> Login In</h1>
<table align="center">
<form:form action="view" method="post" modelAttribute="UserModel">

<tr>
<td>Email</td>
<td><form:input path="email" type="email"/></td>
</tr>
<tr>
<td>Password</td>
<td><form:input path="password"  type="password"/></td>
</tr>
<tr><td colspan=2> <div align="center"><button class="button">Login</button></div></td></tr>

</form:form>
  </table>
  <div align="center">

<p class="p1">Don't have account! <a href="register"> Register</a></p>

  </div>
  
 

  </div>
<div class="footer">
 <p>Copyrights @oes2021<br>
  <a href="mailto:oes@example.com">oes@gmail.com</a></p>
</div>
</body>
</html>