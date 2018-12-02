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
<title>Home</title>
</head>
<body>
	
<header id="title1">D2Decoys</header>

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
<div class="body-content">
	<p class="par">
	Welcome to D2Decoys-the best silhouette decoys on the market.
	Check out our decoys & follow us on social media!
	</p>
		
	<img id="mainimg" src="images/hunting.jpg">
	
	<h2>Our Mission:</h2>
	
	<p class="par">
	Our Mission at D2Decoys is to first honor the Lord Jesus Christ in all business that is done, 
	and to then provide hunters with the best equipment necessary for a successful hunt.
	Our Vision at D2Decoys is to be a highly known and recognizable brand that will continue to innovate 
	and provide hunters with the best equipment through a continual improvement of traditions, values, and products.
	</p>
</div>
	

<footer id="footer">
	<p>Net Apps Project <br>
	Elizabeth Chambers, Taylor Holmes, & Ashley Hong</p>
</footer>
</body>
</html>
