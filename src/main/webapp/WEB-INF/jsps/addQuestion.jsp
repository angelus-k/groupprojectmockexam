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
<body class="background">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
		<div class="title">
			<h1>Manage exam questions</h1>
		</div>
	</div>

	<div class="row">
		<div class="form-container">
			<h2>Enter an exam question</h2>
			<form action="/addQuestionProcess/${typeId}" method="POST">

				<input type="text" name="questionText" placeholder="Enter question" />
				<br> <br> <input type="text" name="answerText1"
					placeholder="Enter answer" /> <input type="number" name="status1"
					placeholder="Enter status" /> <br> <input type="text"
					name="answerText2" placeholder="Enter answer" /> <input
					type="number" name="status2" placeholder="Enter status" /> <br>
				<input type="text" name="answerText3" placeholder="Enter answer" />
				<input type="number" name="status3" placeholder="Enter status" /> <br>
				<input type="text" name="answerText4" placeholder="Enter answer" />
				<input type="number" name="status4" placeholder="Enter status" /> <br>
				<input type="text" name="answerText5" placeholder="Enter answer" />
				<input type="number" name="status5" placeholder="Enter status" /> <br>
				<input type="text" name="answerText6" placeholder="Enter answer" />
				<input type="number" name="status6" placeholder="Enter status" /> <br>
				<input type="text" name="answerText7" placeholder="Enter answer" />
				<input type="number" name="status7" placeholder="Enter status" /> <br>
				<br> <input type="submit" class="button" value="add Question">

			</form>
		</div>
	</div>

	<div class="row">
		<h2>Delete questions</h2>
		<div class="question-container">
			<table>
				<thead>
					<tr>
						<th>QID</th>
						<th>Question Text</th>
					</tr>
				</thead>
				<c:forEach items="${questionList}" var="question">
					<tbody>
						<tr>
							<div class="row row-question">
								<div class="left">
									<td>${question.qId}</td>
								</div>
								<div class="left">
									<td>${question.questionText}</td>
								</div>

								<div class="right">
									<td><a class="button btn-delete"
										href="/deleteQuestion/${question.qId}">Delete question</a></td>
								</div>
							</div>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>

	<div class="row">
		<a class="button" href="/manageExam">ManageExams</a> <a class="button"
			href="/">Home</a>
	</div>

</body>
</html>