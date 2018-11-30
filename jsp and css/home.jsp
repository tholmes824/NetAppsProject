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
<title>Home</title>
</head>

<body>
	
<header id="title2"> D2Decoys </header>

<nav id="navi">
	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="cart.jsp" action="viewCart" name=<%=custID%>>ViewCart</a></li>
		<li><a href="products.jsp">Shop</a></li>
		<li><a href="location.jsp">StoreLocator</a></li>
		<li style="float: right;"><a>Hello, <%=name%></a></li>
	</ul>
</nav>
<hr>

	<img id="mainimg" src="images/hunting.jpg">
	
<p id="par">
Welcome to D2Decoys-the best silhouette decoys on the market. Be sure to check out our decoys and follow us on social media!
</p>

<br>
<br>
<br>

<footer id="footer">
<p>Net Apps Project <br>
Elizabeth Chambers, Taylor Holmes, & Ashley Hong</p>
</footer>
</body>
</html>

