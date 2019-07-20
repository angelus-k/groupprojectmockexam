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
	
		<div class="row">
		<div class="col columnforresultsreviewpage">
			<!-- 	 <div class="textboxforreviewpage"> -->

			<c:forEach items="${Exam.geteQuestions()}" var="examQuestion"
				begin="0" varStatus="theCount">

				<form action="/resultquestion" method="post">
					<input type="hidden" value="${Exam.geteId()}" name="eId"> <input
						type="hidden" value="${theCount.index}" name="questionNumber">
					<input type="radio" name="radio" value="0" style="display: none;"
						checked="checked">
						
					<c:choose>
					<c:when test="${examQuestion.getChosenAnswers().size().equals(examQuestion.getQuestion().getNumberOfCorrectAnswers())}">
								
					<c:choose>
						<c:when
							test="${examQuestion.isAnswered().equals(true)}">
							<c:choose>
							<c:when test="${examQuestion.isCorrectAnswered().equals(true)}">
							<button class="questionboxgreen checkedone" type="submit"
								name="Question">Question ${ theCount.index +1}</button>
							</c:when>
							<c:otherwise>
							<button class="questionboxred checkedtwo" type="submit"
								name="Question">Question ${ theCount.index +1 }</button>
							</c:otherwise>
							</c:choose>
							
						</c:when>
						<c:otherwise>
							<button class="questionboxred checkedtwo" type="submit"
								name="Question">Question ${ theCount.index +1 }</button>
						</c:otherwise>
					</c:choose>
					</c:when>
					<c:otherwise>
					<button class="questionboxred checkedtwo" type="submit"
								name="Question">Question ${ theCount.index +1 }</button>
					</c:otherwise>
					</c:choose>
					
				</form>
			</c:forEach>

		
		</div>
	
	
</body>
</html>
