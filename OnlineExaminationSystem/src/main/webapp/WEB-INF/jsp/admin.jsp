<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources\css\navbar.css" rel="stylesheet">
<link href="resources\css\admin.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">

</head>
<body>
<%-- <table>
<tr><td>Email</td><td>${UserModel.email}</td></tr>
<tr><td>Password</td><td> ${UserModel.password }</td></tr>
</table> --%>
<!-- <ul>
  <li><a href="#home">Logout</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
  <li><a class="active" href="home">Home</a></li>
  </ul> -->
<div class="navbar">
 <a href="home">Logout</a>
 <a href="contact">Contact</a>
  <a href="about">About</a>
  <a href="home">Edit Profile</a>
   <div class="dropdown">
    <button class="dropbtn">Manage Users 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="fmanage">Faculty</a>
      <a href="smanage">Students</a>
     
    </div>
  </div> 
  
  <a href="home">Home</a>
 
  
 
</div>

<h1>Welcome (name of admin)</h1>
<div>
<table>
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