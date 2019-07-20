<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>userhome</title>
<link rel="stylesheet" href="disclaimer.css"></link>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>

</head>
<body class="background no-scroll">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>

	<h1>Hello</h1>
	<h1>pls enter answer</h1>



	<form action="/addAnswer/${qId}" method="POST">



		<input type="text" name="answerText" value="answer" /> <input
			type="number" name="status" value="status" /> <input type="submit"
			value="add answer">

	</form>

	<table>
		<c:forEach items="${answerList}" var="answer">

			<tr>
				<td>${answer.answerText}</td>

				<td>${answer.status}</td>
			</tr>
				<td> <div class="dropdown">
					<button class="dropbtn">
						Dropdown <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
						<a href="/deleteAnswer/${answer.aId}">delete Answer</a> 

					</div>
				</div>
				</td>

		</c:forEach>
	</table>
	<a href="/addQuestion/${typeId}">ManageQuestions</a> 
	<a href="/manageExam">ManageExams</a>
	<a href="/">Home</a>
</body>
</html>