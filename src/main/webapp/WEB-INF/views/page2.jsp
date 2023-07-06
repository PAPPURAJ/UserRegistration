<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    
    
    
    
    <div class="container">
        <h1>Verify Email with CAPTCHA Generator</h1>
        <form action="submitpage2" method="post">
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="captcha">CAPTCHA:</label>
                <div class="g-recaptcha" data-sitekey="6Lde4dcmAAAAAJ5fnOJdv0sWH-XNhA8jCKCbjymM"></div>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>
