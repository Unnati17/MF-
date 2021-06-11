<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h2>Authentication</h2>

<!-- display user name and role -->
	
<hr>
<p> 
 <!-- Displaying the user name -->
 User: <security:authentication property="principal.username"/>
 <br>
 <br>
 <!-- To display the user roles -->
 Roles: <security:authentication property="principal.authorities"/>
</p>

<br>
 
 <!-- Display the content based on roles -->
 
 <security:authorize access="hasRole('ADMIN')">
 <!-- Add a link to point to /leaders ... this is for the managers -->
	
	<p>
	<a href="${pageContext.request.contextPath}/admin">Adminstrators Meeting</a>
	<!--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
		<a href="${contextPath}/leaders">Leadership Meeting</a>-->
		(Only for Admin peeps)
	</p>
  
 </security:authorize>
 
 <security:authorize access="hasRole('TEACHER')">
 <!-- Add a link to point to /leaders ... this is for the managers -->
	
	<p>
	<a href="${pageContext.request.contextPath}/teacher">Teachers Meeting</a>
	<!--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
		<a href="${contextPath}/leaders">Leadership Meeting</a>-->
		(Only for Teachers)
	</p>
  
 </security:authorize>
 


<hr>


  
<!-- method get will not work here -->
<form:form action="logout" method="post">
<input type="submit" value="Logout"/>
</form:form>
</body>
</html>