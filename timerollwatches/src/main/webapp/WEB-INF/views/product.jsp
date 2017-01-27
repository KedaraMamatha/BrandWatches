<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>TimeRollWatches</title>
</head>
<nav class="navbar navbar-inverse" style="background-color: #660000;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/timerollwatches/">TimeRollWatches</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="/timerollwatches/">Home</a></li>
      <li ><a href="product">Products</a></li>
      <li><a href="aboutus">About Us</a></li>
      <li ><a href="#">Customer Care</a></li>
      <li><a href="contactus">Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<body>
<form:form action="productUser" commandName="product" method="post" >
<table border="1">
<tr>
<td colspan ="2" align="center"><h2>Add Products</h2></td>
</tr>
<tr><td>Product Name: <form:input path="productName"/> </td></tr>
<tr><td>Price: <form:input path="price"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="add"/></td></tr>
</table>
</form:form>

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