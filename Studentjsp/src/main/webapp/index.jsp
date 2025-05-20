<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login</title>

  <!-- Bootstrap (Optional) -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    body {
      background: linear-gradient(to right, #6a11cb, #2575fc);
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      height: 100vh;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
    }

 .login-container{
      background-color: #fff;
      padding: 40px 30px;
      border-radius: 12px;
      box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
      width: 100%;
      max-width: 400px;
      text-align: center;
    }

    .login-container h1 {
      margin-bottom: 30px;
      color: #333;
    }

    .form-label {
      font-weight: 600;
      text-align: left;
      display: block;
      margin-bottom: 5px;
    }

    .form-control {
      border-radius: 8px;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      transition: all 0.3s ease;
    }

    .form-control:focus {
      border-color: #2575fc;
      box-shadow: 0 0 5px rgba(37, 117, 252, 0.5);
    }

    .btn-login {
      background-color: #2575fc;
      color: white;
      border: none;
      padding: 12px;
      border-radius: 8px;
      font-weight: bold;
      width: 100%;
      transition: background-color 0.3s ease;
    }

    .btn-login:hover {
      background-color: #1a5ed9;
    }

    .error-message {
      color: red;
      font-size: 0.9em;
      margin-bottom: 15px;
      display: none;
    }
  </style>

  <script>
  
  function validateForm() 
  {
	  var prn = document.getElementById("textPrn").value;

	  if (prn === "") 
	  {
	    alert("Please enter a valid PRN.");
	    return false;
	  } 
	  else 
	  {
	    alert("PRN = " + prn);
	    return true; 
	  }
	}
  
  document.addEventListener('DOMContentLoaded', function() {
	    document.getElementById('registerBtn').addEventListener('click', function() {
	        window.location.href = 'details.html';
	    });
	});

    
 
    
  </script>
</head>

<body>

  <div class="login-container">
    <h1>Student Details</h1>
    <div id="error" class="error-message"></div>
    <form action="next.jsp" method="post" name="studForm" onsubmit="return validateForm()">
      <label for="firstName" class="form-label">Enter FirstName</label>
      <input type="text" name="firstName" id="firstName" class="form-control" placeholder="Enter your firstName">
      
      <label for="lastName" class="form-label">Enter LastName</label>
      <input type="text" name="lastName" id="lastName" class="form-control" placeholder="Enter your lastName">

      <label for="email" class="form-label">Enter Email-Id</label>
      <input type="text" name="email" id="email" class="form-control" placeholder="Enter your email">
      
<br>
      <button type="submit" class="btn btn-login mt-3">Submit</button>
    </form>
  </div>

</body>
</html>
