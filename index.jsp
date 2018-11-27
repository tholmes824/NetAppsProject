<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>D2Decoys</title>
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
<h1 id="title2">Welcome! <br> Please Sign In or Register</h1>

<div id="returner">
	<p>Sign in to Your Account</p>
	<form type="text" action="home.jsp" method="post">
	<div class="left">Email:</div> <div class="right"><input type="text" id="email" name="email" value=""/></div><br>
	<div class="left">Password:</div> <div class="right"><input type="text" id="password" name="password" value=""/></div><br>
	<div class="submit"><input type="submit" id="submit" name="submit" value="Submit!" /></div>
	</form>
</div>

<div id="new">
	<p>New User? Create an Account!</p>
	<form type="text" action="home.jsp" method="post">
	<div class="left">First Name:</div> <div class="right"><input type="text" id="fName" name="fName" value=""/></div><br>
	<div class="left">Last Name:</div> <div class="right"><input type="text" id="lName" name="lName" value=""/></div><br>
	<div class="left">Email:</div> <div class="right"><input type="text" id="email" name="email" value=""/></div><br>
	<div class="left">Password:</div> <div class="right"><input type="text" id="password" name="password" value=""/></div><br>
	<div class="left">Address 1:</div> <div class="right"><input type="text" id="address1" name="address1" value=""/></div><br>
	<div class="left">Address 2:</div> <div class="right"><input type="text" id="address2" name="address2" value=""/></div><br>
	<div class="left">City:</div> <div class="right"><input type="text" id="city" name="city" value=""/></div><br>
	<div class="left">State:</div> <div class="right"><input type="text" id="state" name="state" value=""/></div><br>
	<div class="left">Zip:</div> <div class="right"><input type="text" id="zip" name="zip" value=""/></div><br>
	<div class="left">Phone:</div> <div class="right"><input type="text" id="phone" name="phone" value=""/></div><br>
	<div class="submit"><input type="submit" id="submit" name="submit" value="Submit!" /></div>
	</form>
</div>

</body>
</html>