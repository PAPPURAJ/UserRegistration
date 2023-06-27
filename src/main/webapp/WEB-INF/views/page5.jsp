<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-light bg-light">
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link" href="#">New User</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Existing
					User</a></li>
		</ul>
	</nav>

	<div class="container mt-5">
		<h2>Login Page</h2>
		<form action="myController" method="post">
			<div class="form-group">
				<label for="userid">UserID:</label> <input type="text"
					class="form-control" id="userid" name="userid">
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					class="form-control" id="password" name="password">
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>

		<%-- Display UserID and Password if present --%>
		<%
		String userID = request.getParameter("userid");
		String password = request.getParameter("password");
		if (userID != null && password != null) {
		%>
		<h3>User Credentials:</h3>
		<p>
			UserID:
			<%=userID%></p>
		<p>
			Password:
			<%=password%></p>
		<%
		}
		%>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
