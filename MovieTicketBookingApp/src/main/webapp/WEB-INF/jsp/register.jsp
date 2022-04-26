<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h2>welcome to registration page</h2>
	<hr>

	<form action="/process_register" method="post" object="${customer}">
		<table align="center">
			<tr>
				<td>Full name</td>
				<td><input type="text" name="customerName"
					placeholder="Enter the name" required></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"
					placeholder="Enter the address" required></td>
			</tr>
			<tr>
				<td>Mobile number</td>
				<td><input type="text" name="mobileNumber"
					placeholder="Enter the mobile number" required></td>
			</tr>			
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"
					placeholder="Enter the email" required></td>
			</tr>	
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"
					placeholder="Enter the password" required></td>
			</tr>
			<tr>
			     <td>Select user</td>
			     <td><select name="role">
			         <option value="customer">Customer</option>
			     </select></td>
			</tr>
			<tr>
				
				<td><input type="submit" name="register"
					value="Register" required></td>
			</tr>
		</table>
	</form>
</body>
</html>