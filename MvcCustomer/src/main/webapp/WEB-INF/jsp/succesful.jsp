<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reviewed Item</title>
<style type="text/css">
body
{
background-image:url(img/17.jpg);
background-position:centre;
background-size:cover;
font-family:sans-serif;
margin-top:40px;
}
	span{
		display:inline-block;
		width:100px;
		margin:5px 5px 5px 5px;
		text-align:left;  
	}
</style>
</head>
<body>
	<div align="center">
	<h2> Review Recorded!!</h2>
	<span>Name:</span><span>${firstname}</span><br>
	<span>Email:</span><span>${email}</span><br>
	<span>Review:</span><span>${review}</span><br>
	</div>
  	 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  	<a href="${contextPath}/info">session data</a>

</body>
</html>