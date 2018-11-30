<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Customer"%>
 <%
 Customer custID = (Customer) request.getAttribute("custID"); 
 Customer name = (Customer) request.getAttribute("fName");
 %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="main.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
<meta charset="UTF-8">
<title>Search for your location</title>
</head>
<body>
<header id="title2"> D2Decoys </header>
<nav id="navi">
	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="cart.jsp" action="viewCart" name=<%=custID%>>ViewCart</a></li>
		<li><a href="products.jsp">Shop</a></li>
		<li><a href="location.jsp">StoreLocator</a></li>
		<li><a href="contact.jsp">ContactUs</a></li>
		<li style="float: right;"><a>Hello, <%=name%></a></li>
	</ul>
</nav>
<hr>

<h1>Search for your location</h1>

<form type="text" action="search" method="post">
<label>
Enter the state that you live in:
</label>
<input type="text" name="state"><br>
<input type="submit" name="submission" value="Search" />
</form>



</body>
</html>
