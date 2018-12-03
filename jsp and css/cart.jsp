<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.Customer"%>
 <%
 Customer cust = (Customer) session.getAttribute("customer");
 
 String table ="";
   if(table!=null){
	 table = (String) request.getAttribute("table");
	} else {
		table = "Your cart is empty...";
		table += "<br>";
		table += "Add something to it! Go to the ";
		table += "<a href='products.jsp'>shop</a>";
		table += " page.";
	}
 %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="main.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
<meta charset="UTF-8">
<title>Your Shopping Cart</title>
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

<h1>
Here is what is in your shopping cart!
</h1>

<%= table %>
<form name=updateForm action=updateCart method=post>
<submit></submit>
</form>

</body>
</html>
