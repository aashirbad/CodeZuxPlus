<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>


<meta charset="UTF-8">
<title>Create your Account</title>
<style>


body, html {
  height: 100%;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("${pageContext.request.contextPath}/img/loginbg.png");

  /* Control the height of the image */
  min-height: 100%;
  width:100%;
  height: 100%;
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin-top: 5%;
  margin-right: 10%;
  margin-buttom: 20px;
  margin-left: 20px;
  max-width: 300px;
  padding: 16px;
  background-color: black;
  color: white;
}

/* Full-width input fields */
  input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

  select {
	 width: 100%;
	 padding: 15px;
	 margin: 5px 0 22px 0;
	 border: none;
	 background: #f1f1f1;
	 background-color: #ddd;
     outline: none;
	}
	
	option {
	width: 100%;
	 padding: 15px;
	 margin: 5px 0 22px 0;
	 border: none;
	 background: #f1f1f1;
	 background-color: #ddd;
     outline: none;	
	}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}


</style>





</head>
<body class="bg-img">



<div>
  <form action="/action_page.php" class="container">
    <h1>Create an Account</h1>

    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Your Name" name="Uname" required>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="Uemail" required>

	<label for="accType"><b>Account Type</b></label>
	<select name="accType">
	<option value="student">Student</option>
	<option value="educator">Educator</option>
	</select>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="Upass" required>

    <button type="submit" class="btn">Sign up</button>
  </form>
</div>




</body>
</html>