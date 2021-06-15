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
a {
  color: #41BDA4;
}
a:hover{
	color:white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources\css\loginRegister.css" rel="stylesheet">
<link href="resources\css\navbar.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
</head>
<body>
<div class="navbar">
 <a href="contact">Contact</a>
  <a href="about">About</a>
 <a href="home">Home</a>

    </div>
<div class="bg"></div>
 <div class= "bg-text"> 

<h1>Sign Up</h1>

<table align=center >
<form:form action="login" method="post" modelAttribute="UserModel">
<tr>
<td>Name</td> 
<td><form:input path="username"/></td>

</tr>
<tr>
<td>Email </td>
<td><form:input type="email" path="email"/></td>

</tr>
<tr>
<td>Password</td> 
<td><form:input type="password" path="password"/></td>
</tr>

<tr>
<td>Date of Birth </td>
<td><form:input type="date" path="dob"/></td>
</tr>
<tr><td colspan=2> <div align="center"><button class="button">Submit</button></div></td></tr>

</form:form>
</table>

</div>
<div>
<footer >
  <p>Copyright @oes2021<br>
  <a class="af" href="mailto:oes@example.com">oes@gmail.com</a></p>
</footer>
</div>
</body>
</html>