<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function openForm() {
		document.getElementById("myForm").style.display = "block";
	}

	function closeForm() {
		document.getElementById("myForm").style.display = "none";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="../../css/style.css"></link>
	<link rel="stylesheet" href="../../css/login.css"></link>
<title>Login</title>
</head>
<body class="background no-scroll">
	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
		<div class="title">
			<h1>Mock Exam Generator</h1>
		</div>
	</div>

	<section class="container">
	<div class="row">
		<div class="col col3">
			<div class="box ldc-box">
				<h2 class="section-header">Legal Disclaimer</h2>
			</div>
		</div>
	</div>

	<div class="row">
		<!-- <div class="col col6"> -->
		<div class="textbox disclaimer-text">
			<h4>The following is a property of FDM Frankfurt and shall not
				be shared with any third parties. Third parties include trainees
				from other FDM streams and academies. The document shall not be
				distributed internally or externally. Whilst every care has been
				taken by FDM to ensure that the information contained in this
				publication is correct and complete, it is possible that this is not
				the case. FDM holds no guarantee for the correctness of the answers.
				FDM is not liable for any damage which has occurred or may occur as
				a result of or in any respect related to the use of this
				publication. FDM may change or terminate this publication at any
				time without further notice and shall not be responsible for any
				consequence(s) arising there from. FDM does not allow copy,
				distribution, reselling and reproduction of full or any part of the
				document. Strict action will be taken including lawsuit against
				violation. All other trademarks are the property of their respective
				owners. All rights reserved.</h4>

		</div>
	</div>
	<div class="form-popup" id="myForm">
		<form action="/login" method="POST" class="form-container">
			<h1>Login</h1>

			<label for="username"><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="username" required> <label
				for="password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>
			<button type="submit" class="btn">Login</button>
			<a href="/register">
				<button type="button" class="btn register">Register</button>
			</a>
	<div style="${displaySuccess}">
	<span
		style="font-size: 14px; color: black; font-weight: bold; font-family: Open Sans">
		<span style="color: black">The email </span> <span style="color:#00A4F6">${email}</span> has been registered. You can now log in.
	</span>
</div>
		</form>

		
	</div>
		
</body>
</html>