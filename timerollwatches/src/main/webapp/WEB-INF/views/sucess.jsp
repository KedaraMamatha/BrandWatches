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
<title>Registration Completed</title>
</head>
<nav class="navbar navbar-inverse" style="background-color: #660000;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TimeRollWatches</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="/timerollwatches/">Home</a></li>
      <li ><a href="#">Products</a></li>
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
<form:form action="register" method="post" commandName="user">
<table border="0">
<tr>
<td colspan ="2" align="center"><h2>Registration Success</h2></td>
</tr>
<tr>
<td colspan ="2" align="center">
<h3>Thank you for registration! Here's the review of your details:</h3>
</td>
</tr>
<%-- <td> ${user.firstName}</td>
</tr>
<tr><td>LastName: </td>
<td> ${user.lastName}</td></tr>
<tr><td>Password: </td>
<td> ${user.password}</td></tr>
<tr><td>ConformPassword: </td>
<td> ${user.conformPassword}</td></tr>
<tr><td>EmailId: </td>
<td> ${user.emailId}</td></tr>
<tr><td>PhoneNumber: </td>
<td> ${user.phoneNumber}</td></tr> --%>
</table>
</form:form>
</div>
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