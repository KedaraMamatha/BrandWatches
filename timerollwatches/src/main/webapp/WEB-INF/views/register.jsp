<%-- 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<form:form commandName="user">
<table align="center">
<tr><td>FirstName: <form:input path="firstName"/> </td></tr>
<tr><td>LastName: <form:password path="lastName"/></td></tr>
<tr><td>Password: <form:input path="password"/></td></tr>
<tr><td>ConformPassword: <form:input path="conformPassword"/></td></tr>
<tr><td>EmailId: <form:input path="emailId"/></td></tr>
<tr><td>PhoneNumber: <form:input path="phoneNumber"/></td></tr>
</table>
<center><input type="submit" value="submit"/></center>
</form:form>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<style>
body {
    background-image:url("resources/images/7.jpg");
}
/* .form_bg{
background-color:;
color:;
padding:40px;
border-radius:5px;
margin :auto;
position: absloute;
border:1px solid #fff;
margin :auto;
top:60px;
right:0;
bottom:0;
left: 0;
width :300px;
heigth: 200px;
}
form{
align :center;
}
.form-group{
text-align:center;
}
.checkbox
{
text-align:center;
}
.palceholder{
color:#aaa;
} */
</style>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Sign Up</title>
</head>
<nav class="navbar navbar-inverse" style="background-color: #660000;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TimeRollWatches</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="/timerollwatches/">Home</a></li>
      <li ><a href="product">Products</a></li>
      <li><a href="aboutus">About Us</a></li>
      <li ><a href="#">Customer Care</a></li>
      <li><a href="contactus ">Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="/timerollwatches/register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<body>
<div align="center">
<form:form action="registerUser" commandName="user" method="post" >
<table border="0">
<tr>
<td colspan ="2" align="center"><h2>Signup Here</h2></td>
</tr>
<tr><td>FirstName: <form:input path="firstName"/> </td></tr>
<tr><td>LastName: <form:input path="lastName"/></td></tr>
<tr><td>Password: &nbsp&nbsp<form:password path="password"/></td></tr>
<tr><td>ConformPassword: <form:password path="conformPassword"/></td></tr>
<tr><td>EmailId: <form:input path="emailId"/></td></tr>
<tr><td>PhoneNumber: <form:input path="phoneNumber"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="register"/></td></tr>
</table>
</form:form>
</div>
<%-- <form:form  method="post" action="save" commandName="user">
<center>
 <div class="container">
<div class="container-fluid" >
  <div class="form_bg">
<h2 class="text-center">Signup Here</h2>
<hr>
  <div class="form-group">
    <label for="firstName">Firstname:
    <form:input type="text" path="firstName" class="form-control" required="required" placeholder="Enter your Firstname"/></label>
  </div>
  <div class="form-group">
    <label for="lastName">Lastname:
    <form:input type="text" path="lastName" class="form-control" required="required" placeholder="Enter your lastname"/></label>
  </div>
  <div class="form-group">
    <label for="password">Password:
    <form:input type="password" path="password" class="form-control" required="required" placeholder="Enter your password" /></label>
  </div>
  <div class="form-group">
    <label for="conformPassword">Conform Password:
    <form:input type="password" path="conformPassword" class="form-control"  required="required" placeholder="conform your password"/></label>
  </div>
  <div class="form-group">
    <label for="emailId">EmailId:
    <form:input type="email" path="emailId" class="form-control" required="required" placeholder="Enter your mail id"/></label>
  </div>
   <div class="form-group">
    <label for="phoneNumber">PhoneNumber:
    <form:input type="number" path="phoneNumber" class="form-control" required="required" placeholder="Enter phone number"/></label>
  </div>
<center> <input type="submit" name="submit" value="register"></center>
<br><br>
</div>
</div>
</div>
</center>
</form:form>
 --%>
 </body>

<div align="center">
<div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation" style="background-color: #660000;">
    <div class="container">
    <div class="navbar-text pull-left">
        <p>© 2016 Mamatha ALL RIGHTS RESERVED </p>
    </div>
    <div class="nav navbar-nav navbar-right">
    <br>
<a href="https://www.facebook.com"><i class="fa fa-facebook-square"></i></a>&nbsp
    <a href="https://twitter.com/"><i class="fa fa-twitter fa-2x"></i></a>&nbsp
    <a href="https://www.github.com"><i class="fa fa-github fa-2x"></i></a>&nbsp
    <a href="https://www.youtuub.com"><i class="fa fa-youtube fa-2x"></i></a>&nbsp
    </div>   
</div>
</div>
</div>
</html>