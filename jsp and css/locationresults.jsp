<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.Customer"%>
 <%
 String table = (String) request.getAttribute("results");
 Customer cust = (Customer) session.getAttribute("customer");
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
		<li><a href="CartServlet" name=<%=cust.getCustID()%>>ViewCart</a></li>
		<li><a href="products.jsp">Shop</a></li>
		<li><a href="location.jsp">StoreLocator</a></li>
		<li><a href="contact.jsp">ContactUs</a></li>
		<li style="float: right;"><a>Hello, <%=cust.getfName()%></a></li>
	</ul>
</nav>
<hr>
<h1>Search Results</h1>

<%=table%>

</body>
</html>
