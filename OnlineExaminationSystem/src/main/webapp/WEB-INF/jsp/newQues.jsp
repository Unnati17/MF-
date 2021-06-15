<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources\css\add_sf.css" rel="stylesheet">
<link href="resources\css\navbar.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
<style>
body{
overflow: scroll;
}
</style>
</head>
<body>

<div class="navbar">
<a href="home">Logout</a>
 <a href="contact">Contact</a>
  <a href="about">About</a>
 <a href="home">Home</a>
 
    </div>
<!-- <div class="bg"></div> -->
 <div class= "bg-text"> 

<h1>Add Question</h1>

<table align=center >
<form:form action="viewExam" method="post" modelAttribute="QuesModel" >
<tr>
<td>Serial Number</td> 
<td><form:input type="text" path="sno"/></td>

</tr>
<tr>
<td>Question</td>
</tr>
<tr>
<td><form:textarea path="question" rows="5" /></td>
</tr>
<tr><td>Options</td></tr>
<tr>
<td>A</td> 
<td><form:input type="text" path="optionA"/></td>
</tr>
<tr>
<td>B</td> 
<td><form:input type="text" path="optionB"/></td>
</tr>

<tr>
<td>C</td> 
<td><form:input type="text" path="optionC"/></td>
</tr>

<tr>
<td>D</td> 
<td><form:input type="text" path="optionD"/></td>
</tr>

<tr>
<td>Correct Answer</td>
<td><form:input type="text" path="correct"/></td>
</tr>

<tr><td colspan=2> <div align="center"><button class="button">Add</button></div></td></tr>

</form:form>
</table>

</div>

<div class="footer">
<footer>
  <p>Copyright @oes2021<br>
  <a class="af" href="mailto:oes@example.com">oes@gmail.com</a></p>
</footer>
</div>
</body>
</html>