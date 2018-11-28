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
<h1 id="title2"> Welcome! <br> Please Sign In or Register</h1>

<div id="returner">
	<p>Sign in to Your Account</p>
	<form type="text" action="home.jsp" method="post">
	<div>Email:</div> <input type="text" id="email" name="email" value=""/><br>
	<div>Password:</div> <input type="text" id="password" name="password" value=""/><br><br>
	<input class="submit" style="width:65px;" type="submit" id="submit" name="submit" value="Submit!" /></div>
	</form>
</div>

<div id="new">
	<p>New User? Create an Account!</p>
	<form type="text" action="home.jsp" method="post">
	
	<div>First Name:</div> <input type="text" id="fName" name="fName" value=""/><br>
	<div>Last Name:</div> <input type="text" id="lName" name="lName" value=""/><br>
	<div>Email:</div> <input type="text" id="email" name="email" value=""/><br>
	<div>Password:</div> <input type="text" id="password" name="password" value=""/><br>
	<div>Address 1:</div> <input type="text" id="address1" name="address1" value=""/><br>
	<div>Address 2:</div> <input type="text" id="address2" name="address2" value=""/><br>
	<div>City:</div> <input type="text" id="city" name="city" value=""/><br>
	<div>State:</div> <input type="text" id="state" name="state" value=""/><br>
	<div>Zip:</div> <input type="text" id="zip" name="zip" value=""/><br>
	<div>Phone:</div> <input type="text" id="phone" name="phone" value=""/><br><br><br>
	<input class="submit" style="width:65px;" type="submit" id="submit" name="submit" value="Submit!" />
	</form>
</div>

</body>
</html>
