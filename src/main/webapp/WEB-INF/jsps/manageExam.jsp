<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>userhome</title>

<link rel="stylesheet" href="disclaimer.css"></link>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body class="background">
	
	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Manage exams</h1>
		
		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
			<form action="/">
				<button id="goback" class="button button2">Home</button>
			</form>
		</div>	
	</div>
	

<div class="container manage-exam-content">
	<form action="/manageExamProcess" method="POST">
		<table>
			<tr>
				<td>Enter exam type</td>
				<td>Number of questions</td>
				<td>Exam duration</td>
				<td></td>
			</tr>
			<tr>
				<td><input  type="text" name="examType" placeholder="enter typeOfExam name" /></td>
				<td><input  type="number" name="numberOfQuestions" placeholder="enter number of Questions" /></td>
				<td><input  type="number" name="duration" placeholder="enter exam duration in seconds" /></td>
				<td><input class="button add-exam" type="submit" value="addExam" /></td>
			</tr>
		</table>
	</form>

	<table class="exam-table">
		<thead>
		<tr>
			<th class="exam-table-th">Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th class="exam-table-th"># of questions &nbsp;&nbsp;</th>
			<th class="exam-table-th">Duration </th>
			<th class="exam-table-th"></th>
		</tr>
		</thead>
		<c:forEach items="${TypeOfExamList}" var="typeOfExam">
			<tr>
				<td >${typeOfExam.examType}</td>
				<td >${typeOfExam.numberOfQuestions}</td>
				<td>${typeOfExam.duration}</td>
				<td>
				<div class="dropdown">
					<button class="dropbtn exam">
						Action <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
						<a href="/addQuestion/${typeOfExam.typeId}">Manage questions</a> 
						<a href="/deleteConfirmation/${typeOfExam.typeId}">Delete exam</a>

					</div>
				</div>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
	

</body>
</html>