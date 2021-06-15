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
<link href="resources\css\faculty_manage.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Darker+Grotesque:wght@300&display=swap" rel="stylesheet">
 <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- <script>
function goBack() {
  window.history.back()
}

function goForward() {
  window.history.forward();
}
</script> -->
</head>
<body>
<div class="navbar">
 <a href="home">Logout</a>
 <a href="contact">Contact</a>
 <a href="about">About</a>
 <a href="">Edit Profile</a>
 <a href="home">Home</a>

 <!-- <button onclick="goBack()" class="previous round">&#8249;</button>
 <button onclick="goForward()" class="next round">&#8250;</button>  -->

</div>

<h2>Manage Faculty </h2>
<div class="container">
<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name" align="center"> 
<form:form action="addFaculty">
<button class="add" > Add new</button>
</form:form>
<table align="center" id="t01" >

  <tr>

    <th>Name</th>
    <th>Email</th> 
    <th>Date of Birth</th>
    <th>Action</th>
  </tr>
  <tr>

  	<td>Jim</td>
    <td>jim@gmail.com</td>
    <td>17-02-1999</td>
    <td >
    <button class="ed" >Edit <i class="fa fa-edit"></i></button>
	<button class="ed"  onclick="deleteRow(this)" >Delete <i class="fa fa-trash"></i></button>    
    
    
    </td> 
  </tr>
  <tr>
    <td>Eve</td>
    <td>eve@gmail.com</td>
    <td>1-04-1994</td>
    <td >
    <button class="ed" >Edit <i class="fa fa-edit"></i></button>
	<button class="ed"  onclick="deleteRow(this)">Delete <i class="fa fa-trash"></i></button>    
    </td>
    </tr>
    
    <tr>
    <td>$UserModel.username</td>
    <td>$UserModel.email</td>
    <td>$UserModel.dob</td>
    <td >
    <button class="ed" >Edit <i class="fa fa-edit"></i></button>
	<button class="ed"  onclick="deleteRow(this)">Delete <i class="fa fa-trash"></i></button>    
    </td>
    </tr>
  
</table>
</div>
<script>
function myFunction() {
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("t01");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
<!-- deleting the row -->
<script>
function deleteRow(r) {
  var i = r.parentNode.parentNode.rowIndex;
  document.getElementById("t01").deleteRow(i);
}
</script>
<div>
<footer >
  <p>Copyright @oes2021<br>
  <a class="af" href="mailto:oes@example.com">oes@gmail.com</a></p>
</footer>
</div>

</body>
</html>