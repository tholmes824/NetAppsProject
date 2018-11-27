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

<header id="header"> D2Decoys
</header>

<h1 id="navi">
	<a href="./.jsp">View Cart</a>
	<a href="products.jsp">Shop</a>
	<a href="./.jsp">Store Locator</a>
</h1>

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
<img class=baddecoy src="images/baddecoy.jpg">
<p>
Wired Turkey<br>
Full sized turkey decoy.
Turkeys won't even notice the difference.<br>
$25.00<br>
</p>
<input type="hidden" id="2" name="wiredturkey" value="2">
</div>

<div class=clearfix>
<img class=owlgirl src="images/owldecoy.jpg">
<p>
Lovable Owl (girl not included)<br>
Full size owl decoy
So lovable the girl won't leave it alone!<br>
$300<br>
</p>
<input type="hidden" id="3" name="loveableowl" value="3">
</div>



</body>
</html>