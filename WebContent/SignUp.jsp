<%@ page import="java.sql.*"%>
<%@ page import = "java.util.Date,java.text.SimpleDateFormat,java.text.ParseException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body bgcolor="Skyblue">
<%
	java.util.Date now = new java.util.Date();
	String DATE_FORMAT1 = "dd/MM/yyyy";
	SimpleDateFormat sdf1 = new SimpleDateFormat(DATE_FORMAT1);
	String strDateNew1 = sdf1.format(now);
%>
<h1 align="center">User Registration</h1>
<form name="s" action="SignUpServlet" method="post">
<table align="center" width="400" height="300">
<tr>
	<td>Name</td>
	<td><input type="text" name="unn"></td>
</tr>
<tr>
	<td>User ID</td>
	<td><input type="text" name="uidd" id="name"></td>
</tr>
<tr>
	<td>Password</td>
	<td><input type="password" name="passs"></td>
</tr>
<tr>
	<td>Mobile</td>
	<td><input type="text" name="mobb"></td>
</tr>
<tr>
	<td>Email ID</td>
	<td><input type="text" name="eidd"></td>
</tr>
<tr>
	<td>Date</td>
	<td><input type="text" name="date" value="<%=strDateNew1%>"></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" name="s" value="submit" class="b1" ><input type="reset" name="r" value="clear" class="b1"></td>
</tr>
</table>
</form>
<a href="index.jsp"><font color="#000000" size="2"></a>
</body>
</html>