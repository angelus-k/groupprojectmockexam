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
</head>
<body class="background">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Userresultspage</h1>
		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
		</div>
		<form action="/">
			<button id="goback" class="button button2">Home</button>
		</form>
	</div>
	<div>
		<h2>Attended Exams</h2>
		<table id="tableList" style="width: 30%">
			<tr>
				<th>ID</th>
				<th>Type</th>
				<th>Result</th>
				<th>Date</th>
			</tr>
			<c:forEach items="${userExams}" var="exam">
				<tr>
					<td><a href="/userQuestionResultspage/${exam.geteId()}"><button
								id="userprofile-id" class="output">${exam.geteId()}</button></a></td>
					<td><a href="/userQuestionResultspage/${exam.geteId()}"><button
								id="userprofile-id" class="output">${exam.getTypeOfExam().getExamType()}</button></a></td>
					<td><a href="/userQuestionResultspage/${exam.geteId()}"><button
								id="userprofile-id" class="output">${exam.getResultValue()}%</button></a></td>
					<td><a href="/userQuestionResultspage/${exam.geteId()}"><button
								id="userprofile-id" class="output">${exam.getFormatDate()}</button></a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
