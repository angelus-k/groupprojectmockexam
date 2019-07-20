<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="/css/style.css"></link>
<title>Question Reports</title>
</head>
<body class="background no-scroll always">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Manage Reports</h1>
		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
		</div>
	</div>


	<section class="userlist-section">


	<table>
		<tbody>
			<tr>
				<td><form action="/">
						<button class="button button2">Home</button>
					</form></td>

			</tr>
		</tbody>
	</table>


	<div class=userlist-table>
		<h2 style="margin-left: 2%; margin-top: 1%;">Reportlist</h2>

		<table>
			<thead>
				<tr>
					<th>Report ID</th>
					<th>Report Text</th>
					<th>Question ID</th>
					<th>User</th>
				</tr>
			</thead>
			<c:forEach items="${reportlist}" var="report">
				<tbody>
					<tr>
						<td><form method="POST"
								action="/addQuestion/${report.question.getTypeOfExam().getTypeId()}">
								<button id="userprofile-id" class="output">${report.rId }</button>
							</form></td>
						<td><form method="POST"
								action="/addQuestion/${report.question.getTypeOfExam().getTypeId()}">
								<button class="output">${report.reportText}</button>
							</form></td>
						<td><form method="POST"
								action="/addQuestion/${report.question.getTypeOfExam().getTypeId()}">
								<button class="output">${report.question.getqId()}</button>
							</form></td>
						<td><form method="POST"
								action="/addQuestion/${report.question.getTypeOfExam().getTypeId()}">
								<button class="output">${report.user.getEmail()}</button>
							</form></td>
						<td><form action="/admin/questionReportsDelete/${report.rId}"
								method="POST">
								<button class="button btn-delete">remove</button>
							</form></td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

	</section>

</body>
</html>