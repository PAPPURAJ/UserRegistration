<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String email=request.getParameter("email").toLowerCase(); %>
   
<!DOCTYPE html>
<html>
<head>
    <title>Verify Email with CAPTCHA Generator</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>


<body>


    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="#">New User</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Existing User</a>
            </li>
        </ul>
   
    </nav>
    
    	<h1>OTP sent to <%=email%> </h1>
    	<h1>OTP is <%=request.getParameter("otpV")%> </h1>S
    
    
    <div class="container">
        <h1>Verify Email with OTP</h1>
        <form action="otpsubmit" method="post">
            <div class="form-group">
                <label for="otp">OTP:</label>
                <input type="text" class="form-control" id="otp" name="otp" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>

</html>