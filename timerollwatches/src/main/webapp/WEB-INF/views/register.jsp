<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body {
    background-image:url("resources/images/7.jpg");
}
.form_bg{
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
}
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
      <li ><a href="#">Products</a></li>
      <li><a href="aboutus">About Us</a></li>
      <li ><a href="#">Customer Care</a></li>
      <li><a href="contactus ">Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<body>
<form>
<center>
 <div class="container">
<div class="container-fluid" >
  <div class="form_bg">
<h2 class="text-center">Signup Here</h2>
<hr>
  <div class="form-group">
    <label for="fname">First Name:
    <input type="text" class="form-control" id="fname" placeholder="Enter your Firstname"></label>
  </div>
  <div class="form-group">
    <label for="lname">Last Name:
    <input type="text" class="form-control" id="lname" placeholder="Enter your lastname"></label>
  </div>
  <div class="form-group">
    <label for="pwd">Password:
    <input type="password" class="form-control" id="pwd" placeholder="Enter your password"></label>
  </div>
  <div class="form-group">
    <label for="cpwd">Conform Password:
    <input type="password" class="form-control" id="pwd1" placeholder="conform your password"></label>
  </div>
  <div class="form-group">
    <label for="fname">Email Id:
    <input type="email" class="form-control" id="fname" placeholder="Enter your mail id"></label>
  </div>
<center>  <button type="submit" class="btn btn-default">Submit</button></center>
<br><br>
</div>
</div>
</div>
</center>
</form>
</body>
<center>
<div class="navbar navbar-inverse navbar-fixed-bottom" role="navigation" style="background-color: #660000;">
    <div class="container">
    <div class="navbar-text pull-left">
        <p>© 2016 Mamatha ALL RIGHTS RESERVE </p>
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
</center>
</html>