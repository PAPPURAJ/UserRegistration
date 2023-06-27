<%@page import="database.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<%  boolean login=(boolean)request.getAttribute("login");
		out.print("Login "+(login?"Success!":"Failed!"));
		
	%>

</body>
</html>