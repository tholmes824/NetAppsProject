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
<title>Products</title>
</head>
<body>

<header id="title2"> D2Decoys</header>

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

<table>
	<th>
	Product
	</th>
	<th>
	Description
	</th>
	<th>
	Price
	</th>
	<th>
	Add to Cart
	</th>

	
	<tr>
	<td>
	Half-A-Man
	<img class=ham src="images/half-a-man1.jpg">
	</td>
	
	<td>
	Size emulates an immature Jake. <br>
	Comes with two metal ground stakes.
	</td>
	
	<td>
	$28.00
	</td>
	
	<td>
		<form type="text" action="holder" method="post">
		<label>Quantity</label> <input type="text" id="quantity" name="quantity" value="0" required/><br>
		<input class="shop" type="submit" id="submit" name="submit" value="Submit!" /></div>
		<input class=ham type="hidden" id="1" name="half-a-man" value="1">
		</form>
	</td>
	
	
	</tr>
	<td>
	Wired Turkey
	<img class=baddecoy src="images/joke.jpg">
	</td>
	
	<td>
	Full sized turkey decoy. <br>
	Turkeys won't even notice the difference.
	</td>
	
	<td>
	$30.00
	</td>
	
	<td>
		<form type="text" action="holder" method="post">
		<label>Quantity</label> <input type="text" id="quantity" name="quantity" value="0" required/><br>
		<input class="shop" type="submit" id="submit" name="submit" value="Submit!" /></div>
		<input class=ham type="hidden" id="1" name="half-a-man" value="1">
		</form>
	</td>
	</tr>
	
	
	</tr>
	<td>
	Lovable Owl (girl not included)
	<img class=owlgirl src="images/owl.jpg">
	</td>
	
	<td>
	Full size owl decoy <br>
	So lovable the girl won't leave it alone!
	</td>
	
	<td>
	$300.00
	</td>
	
	<td>
		<form type="text" action="holder" method="post">
		<label>Quantity</label> <input type="text" id="quantity" name="quantity" value="0" required/><br>
		<input class="shop" type="submit" id="submit" name="submit" value="Submit!" /></div>
		<input class=ham type="hidden" id="1" name="half-a-man" value="1">
		</form>
	</td>
	</tr>
	
</table>


<footer id="footer">
	<p>Net Apps Project <br>
	Elizabeth Chambers, Taylor Holmes, & Ashley Hong</p>
</footer>



</body>
</html>
