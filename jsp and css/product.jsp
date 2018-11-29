<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="main.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Audiowide" rel="stylesheet">
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>

<header id="title2"> D2Decoys</header>

<nav id="navi">
	<ul>
		<li><a href="home.jsp">Home</a></li>
		<li><a href="cart.jsp">ViewCart</a></li>
		<li><a href="products.jsp">Shop</a></li>
		<li><a href="location.jsp">StoreLocator</a></li>
		<li style="float: right;"><a>Hello, JavaName</a></li>
	</ul>
</nav>
<hr>

<div class=clearfix>
<img class=ham src="images/half-a-man1.jpg">
<p>
Half-A-Man
Size emulates an immature Jake.
Comes with two metal ground stakes.
<br>
$28.00<br>
</p>
<input class=ham type="hidden" id="1" name="half-a-man" value="1">
</div>

<div class=clearfix>
<img class=baddecoy src="images/joke.jpg">
<p>
Wired Turkey<br>
Full sized turkey decoy.
Turkeys won't even notice the difference.<br>
$25.00<br>
</p>
<input type="hidden" id="2" name="wiredturkey" value="2">
</div>

<div class=clearfix>
<img class=owlgirl src="images/owl.jpg">
<p>
Lovable Owl (girl not included)<br>
Full size owl decoy
So lovable the girl won't leave it alone!<br>
$300<br>
</p>
<input type="hidden" id="3" name="loveableowl" value="3">
</div>

<footer id="footer">
	<p>Net Apps Project <br>
	Elizabeth Chambers, Taylor Holmes, & Ashley Hong</p>
</footer>



</body>
</html>
