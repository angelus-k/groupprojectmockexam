<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="/css/style.css"></link>
<title>Userlist</title>
</head>
<body class="background">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Manage users</h1>
		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
		</div>
	</div>

	
	<section class="userlist-section">
	
	<div class="userlist-control" style="margin-left: 2%;">

		<h2>User Control:</h2>
		<form action="/admin/userList/update" method="POST">
			<table>
				<tbody>
					<tr>
						<td>Email:</td>
						<td><input placeholder="Email" type="text" name="email"
							required />
						<td><div class="marginPadding0" style="${display}">
								<span
									style="font-weight: bold; font-family: Open Sans; font-size: 18px; color: #00A4F6;">
									The email <span style="color: black;">${emailExists}</span>
									does not exist.
								</span>
							</div></td>
					</tr>
					<tr>
						<td>Action:</td>
						<td><select name="change">
								<option value="admin">role to admin</option>
								<option value="user">role to user</option>
								<option value="passwordTo123">reset password to "123"</option>
								<option value="showProfile">search user</option>
								<option value="delete">delete</option>
						</select></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="confirm" name="update" /></td>
					</tr>
				</tbody>
			</table>
		</form>
		<table>
			<tbody>
				<tr>
					<td><form action="/">
							<button class="button button2">Home</button>
						</form></td>
					
				</tr>
			</tbody>
		</table>
	</div>

	<div class=userlist-table>
	<h2 style="margin-left: 2%; margin-top: 1%;">Userlist</h2>
	
		<table>
			
			<tr >
				<th>ID</th>
				<th>Email</th>
				<th>Role</th>
			</tr>
			
			<c:forEach items="${userList}" var="user">
			
				<tr>
					<td><form action="/userProfile/${user.id}">
							<button id="userprofile-id" class="output">${user.id }</button>
						</form></td>
					<td><form action="/userProfile/${user.id}">
							<button class="output">${user.email}</button>
						</form></td>
					<td><form action="/userProfile/${user.id}">
							<button class="output">${user.role}</button>
						</form></td>
						<!--  
					<td><form action="/userProfile/${user.id}">
							<input class="output" type="submit" value="Show Profile" />
						</form></td>-->
					<td><form action="/admin/userList/update/${user.id}"
							method="POST">
							<input placeholder="New password" type="text" name="password"
								required /> 
								<input type="submit" value="change password"
								name="update" />
						</form></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	
	</section>
	
</body>
</html>