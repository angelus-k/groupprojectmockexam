<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>userhome</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="disclaimer.css"></link>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>

</head>
<body class="background no-scroll always">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		

		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
		</div>
	</div>
	<div class="row">

		<h2>Admin Control</h2>
		<form action="/manageExam">
			<button class="button button2">ManageExams</button>
		</form>
		<form action="/admin/questionReports" method="POST">
			<button class="button button2">View Reports</button>
		</form>

		<form action="admin/userList" method="GET">
			<button class="button button2">Usercontrol</button>
		</form>
		<form action="viewStatistics">
			<button class="button button2">View statistics</button>
		</form>
	</div>
</body>
</html>