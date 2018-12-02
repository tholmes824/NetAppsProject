<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.Customer"%>
<%
Customer cust = (Customer) session.getAttribute("customer");
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="main.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
<meta charset="UTF-8">
<title>Contact Us</title>
</head>
<body>

<header id="title2"> D2Decoys </header>

<nav id="navi">
	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="cart.jsp" action="viewCart" name=<%=cust.getCustID()%>>ViewCart</a></li>
		<li><a href="products.jsp">Shop</a></li>
		<li><a href="location.jsp">StoreLocator</a></li>
		<li><a href="contact.jsp">ContactUs</a></li>
		<li style="float: right;"><a>Hello, <%=cust.getfName()%></a></li>
	</ul>
</nav>
<hr>
<h1>Give Us Your Input</h1>

 <form name="guessForm" action="guess" method="post">
    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Your name...">
	<br>
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Your email...">
	<br>
	<br>
    <label for="comment">Comment</label>
    <textarea id="comment" name="comment" placeholder="Write something..."></textarea>
	<br>
    <input type="submit" value="Submit" class="comments">

  </form>



</body>
</html>
