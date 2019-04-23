<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> Login </title>
</head>
<body>
<h1>User Login</h1>
<form id="user1" method="post" action="LoginServlet" name="s" onSubmit="return valid()">
<br>User Id <br><input required type="text" name="user1">
<br>Password<br><input required type="password" name="pass">
<br><input type="submit" name="user" value="Login"><br>
<a href="SignUp.jsp"><font color="#000000" size="2"><b>New User?</b></font></a>
</form>
</body>
</html>