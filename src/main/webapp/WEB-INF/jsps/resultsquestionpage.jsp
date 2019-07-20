<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Results Question Page</title>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>

</head>
<body class="background no-scroll always">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Results</h1>
		<form action="/logout">
			<button id="goback" class="button button2">Logout</button>
		</form>
		<form action="/">
			<button id="goback" class="button button2">Home</button>
		</form>
	</div>


	<section class="container">

	<div class="row">
		<div class="col col8">
			<div class="textboxforquestionspage">
				Question Number: ${ questionNumber +1} <br> ${ Exam.geteQuestions().get(questionNumber).getQuestion().getQuestionText() }
			</div>
		</div>
	</div>

	</div>
	</section>
	<section class="container">
	<div class="row">

		<div class="col col8">

			<c:forEach
				items="${Exam.geteQuestions().get(questionNumber).getQuestion().getPossibleAnswers()}"
				var="answer">
				<c:set value="${1}" var="correct"></c:set>
					<c:choose>
						<c:when
							test="${Exam.geteQuestions().get(questionNumber).getChosenAnswers().contains(answer)}">
							<c:choose>
								<c:when test="${ answer.status == correct }">
									<label class="containerforradiobutton" disabled> <font
										color="#00cc66"> ${ answer.answerText } <input
											type="radio" name="radio" value="${answer.aId }"
											checked="checked" disabled> <span class="checkmark"></span></font>
									</label>
								</c:when>
								<c:otherwise>
									<label class="containerforradiobutton" disabled> <font
										color="#ff5050"> ${ answer.answerText } <input
											type="radio" name="radio" value="${answer.aId}"
											checked="checked" disabled> <span class="checkmark"></span></font>
									</label>
								</c:otherwise>
							</c:choose>
						</c:when>
						<c:otherwise>
							<c:choose>
								<c:when test="${ answer.status == correct }">
									<label class="containerforradiobutton" disabled> <font
										color="#00cc66"> ${ answer.answerText } <input
											type="radio" name="radio" value="${answer.aId }" disabled>
											<span class="checkmark"></span></font>
									</label>
								</c:when>
								<c:otherwise>
									<label class="containerforradiobutton" disabled> ${ answer.answerText }
										<input type="radio" name="radio" value="${answer.aId }"
										disabled> <span class="checkmark"></span>
									</label>
								</c:otherwise>
							</c:choose>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
</div>
</section>

		
		<div class="specialcolumn">
			<form action="/resultquestion" method="post">
				<div class="row">
					<button type="submit" class="nextboxbuttononquestionspage">
						PREVIOUS</button>
				</div>
				<input type="hidden" value="${questionNumber-1}"
					name="questionNumber"> <input type="hidden"
					value="${Exam.geteId()}" name="eId">
			</form>
			<form action="/resultquestion" method="post">
				<div class="row">
					<button type="submit" class="nextboxbuttononquestionspage">NEXT</button>
				</div>
				<input type="hidden" value="${questionNumber+1}"
					name="questionNumber"> <input type="hidden"
					value="${Exam.geteId()}" name="eId">
			</form>
			<form action="resultsreviewpage" method="post">
				<div class="row">
					<button type="submit" class="reviewboxbuttononreviewpage">REVIEW</button>
					<input type="hidden" value="${Exam.geteId()}" name="eId">
				</div>
			</form>
		</div>
		</form>
	</div>
	

	<section>
	<div class="row">
		<div class="col collapsedtimebox">
			<!-- Display the countdown timer in an element -->
			<p id="demo"></p>

			<script>
		// Set the date we're counting down to
		var a = new Date();
		var number = [[${timeleft.getTimeleft()}]];
		var timeleft= number*1000;
		a.setTime( a.getTime() + timeleft );
		var countDownDate = a.getTime();
		// Update the count down every 1 second
		//var x = setInterval(function() {
		
		// Get todays date and time
		var now = new Date().getTime();
		
		// Find the distance between now and the count down date
		var distance = countDownDate - now;
		
		// Time calculations for days, hours, minutes and seconds
		var days = Math.floor(distance / (1000 * 60 * 60 * 24));
		var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
		var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
		var seconds = Math.floor((distance % (1000 * 60)) / 1000);
		
		// Display the result in the element with id="demo"
		document.getElementById("demo").innerHTML = "<h3>"+ hours +"h "+  minutes + "m " + seconds + "s " + "</h3>";
				
		</script>

		</div>
	</div>
	</section>

	<!-- 	question number: ${ questionNumber }
	<div class="row">
		<!-- Display the countdown timer in an element -->
	<!--	<p id="demo"></p>

		<script>
		// Set the date we're counting down to
		var a = new Date();
		 var number = [[${timeleft.getTimeleft()}]];
		var timeleft= number*1000;
		a.setTime( a.getTime() + timeleft );
		var countDownDate = a.getTime();
		// Update the count down every 1 second
		var x = setInterval(function() {
		
		  // Get todays date and time
		  var now = new Date().getTime();
		
		  // Find the distance between now and the count down date
		  var distance = countDownDate - now;
		
		  // Time calculations for days, hours, minutes and seconds
		  var days = Math.floor(distance / (1000 * 60 * 60 * 24));
		  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
		  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
		  var seconds = Math.floor((distance % (1000 * 60)) / 1000);
		
		  // Display the result in the element with id="demo"
		  document.getElementById("demo").innerHTML = minutes + "m " + seconds + "s ";
		
		  // If the count down is finished, write some text 
		  if (distance < 0) {
		    clearInterval(x);
		    document.getElementById("demo").innerHTML = "Time is up";
		  }
		}, 1000);
		</script>

	</div> -->

</body>
</html>