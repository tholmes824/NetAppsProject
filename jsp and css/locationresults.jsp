<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 
 String table = (String) request.getAttribute("results");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search for your location</title>
</head>
<body>
<h1>Search Results</h1>

<%=table%>

</body>
</html>