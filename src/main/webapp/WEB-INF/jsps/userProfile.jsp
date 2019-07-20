<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="/css/style.css"></link>
<title>User Profile</title>
<script>
	var check = function() {
		if (document.getElementById('password').value == document
				.getElementById('confirm_password').value) {

			document.getElementById('update').type = 'submit';
			document.getElementById('update').style.color = 'black';
			document.getElementById('message').style.color = '#00A4F6';
			document.getElementById('message').innerHTML = 'matching';
		} else {
			document.getElementById('update').type = 'button';
			document.getElementById('update').style.color = 'red';
			document.getElementById('message').style.color = 'red';
			document.getElementById('message').style.font = 'Open Sans';
			document.getElementById('message').style.font.weight = 'bold';
			document.getElementById('message').innerHTML = 'not matching';
		}
	}
</script>
</head>
<body class="background">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">User profile</h1>
		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
			<form action="/">
				<button id="goback" class="button button2">Home</button>
			</form>
		</div>
	</div>

	<div class="first-div row">
		<h1 style="margin-top: 2%;">User ID:${userToShow.id}</h1>
		<table id="tableList" style="margin: auto; text-align: left;">
			<tr>
				<td>ID:</td>
				<td>${userToShow.id}</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>${userToShow.email}</td>
			<tr>
				<td>Role:</td>
				<td>${userToShow.role}</td>
			</tr>
		</table>
	</div>
	<div class="row">
		<h2>Update details:</h2>

		<form action="/userProfile/update/${userToShow.id}" method="POST">
			<table style="margin: auto; text-align: left;">
				<tbody>
					<tr>
						<td><input value="${userToShow.id}" type="hidden" name="id" /></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input placeholder="Email" type="text" name="email"
							pattern="^[a-zA-Z0-9._%+-]+@fdmgroup+\.com$"
							title="Use your @fdmgroup.com email adress." />
					</tr>
					<tr>
						<td></td>
						<td style="${display}"><p
								style="font-size: 14px; color: #538b01; font-weight: bold; font-style: italic;">
								The email <span style="color: red">"${emailExists}"</span>
								already exists, please take another one.
							</p></td>
					</tr>
					<tr>
						<td>*Recent Password:</td>
						<td><label><input placeholder="Recent Password"
								type="password" type="text" id="recentPassword" name="password"
								required /></label></td>
					</tr>
					<tr>
						<td></td>
						<td style="${displayPasswordFalse}"><p
								style="font-size: 14px; color: red; font-weight: bold; font-style: italic;">
								The password is not right. Update aborted.</p></td>
					</tr>
					<tr>
						<td>New password:</td>
						<td><label><input placeholder="New password"
								type="password" type="text" id="password" name="newPassword"
								onkeyup='check();' name="password" pattern="(?=.*[A-Z]).{6,}"
								title="Must contain one upper case letter and at least 6 or more characters. Do not use your fdm password." /></label></td>
					</tr>
					<tr>
						<td>Confirm new password:</td>
						<td><label><input type="password"
								placeholder="Confirm Password" id="confirm_password"
								onkeyup='check();'> <span id='message'> </span></label></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Update" name="update"
							id="update" class="button" /></td>
					</tr>
				</tbody>
			</table>
		</form>

	</div>
</body>
</html>
