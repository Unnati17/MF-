<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="resources\css\add_sf.css" rel="stylesheet">
<link href="resources\css\navbar.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
   <title>Insert title here</title>
</head>
<body>
<div class="navbar">
 <a href="home">Logout</a>
 <a href="contact">Contact</a>
  <a href="about">About</a>
 <a href="home">Home</a>

    </div>

 <div class= "bg-text"> 

<h1>Exam Details</h1>


<table align="center">
<form:form action="examlist" method="post" modelAttribute="ExamModel">
<tr><td>Exam Name</td> 
<td ><form:input path="examName"/></td></tr>
<tr><td>Date of Exam</td>
<td><form:input type="date" path="examDate"/></td></tr>

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