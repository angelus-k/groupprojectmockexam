<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/css/style.css"></link>
<link rel="stylesheet" href="/css/register.css"></link>
</head>
<body class="background no-scroll always">
	
	
	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
		<form action="/logout">
			<button class="button btn" id="goback">Back</button>
		</form>
	</div>
	<section class="container">
	<div class="row form-row">
		<script>
			var check = function() {
				if (document.getElementById('password').value != null
						&& document.getElementById('password').value == document
								.getElementById('confirm_password').value) {
					document.getElementById('submit').type = 'submit';
					document.getElementById('submit').style.color = 'white';
					document.getElementById('matchMessage').style.color = '#00A4F6';
					document.getElementById('matchMessage').innerHTML = 'matching';
				} else {
					document.getElementById('submit').type = 'button';
					document.getElementById('submit').style.color = 'red';
					document.getElementById('matchMessage').style.color = 'red';
					document.getElementById('matchMessage').style.font = 'Open Sans';
					document.getElementById('matchMessage').style.font.weight = 'bold';
					document.getElementById('matchMessage').innerHTML = 'not matching';
				}
			}
		</script>

		<fieldset>
			<legend>Register</legend>
			<div class="first-div" style="margin-bottom: 20px;">
				<h1>Create an account:</h1>
				<form method="POST" action="/register">
					<table>
						<tbody>
							<tr>
								<td>Email:</td>
								<td><label><input id="reg-input" placeholder="Email" type="text"
									name="email" pattern="^[a-zA-Z0-9._%+-]+@fdmgroup+\.com$" title="Use your @fdmgroup.com email adress." required />
									</label></td>
							</tr>
							<tr>
								<td></td>
								<td style="${display}"><span
										style="font-size: 14px; color: #00A4F6; font-weight: bold; font-family: Open Sans">
										The email <span style="color: black">${emailExists}</span>
										already exists, please take another one.
									</span></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><label><input placeholder="Password"
										type="password" type="text" id="password" name="password" pattern="(?=.*[A-Z]).{6,}" title="Must contain one upper case letter and at least 6 or more characters. Do not use your fdm password."
										onkeyup='check();' required /></label></td>
							</tr>
							<tr>
								<td></td>
								<td><label><input type="password"
										placeholder="Confirm Password" id="confirm_password"
										onkeyup='check();' required> <span id='matchMessage'>
									</span></label></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><input type="submit" class="form-container left btn"
									id="submit" value="Register" name="submit" />&nbsp; <input
									class="form-container btn" id="reset" type="reset"
									value="Clear" name="clear" /></td>
								<td></td>
								</form>
								</fieldset>
							</tr>
						</tbody>
					</table>
			</div>

		</fieldset>
	</div>
	</section>
</body>
</html>