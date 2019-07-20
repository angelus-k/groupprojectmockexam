<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Review Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>

</head>
<body class="background no-scroll always">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Results Review</h1>
		<form action="/logout">
			<button id="goback" class="button button2">Logout</button>
		</form>
	</div>

	<div class="row">
		<div class="col columnforresultsreviewpage">
			<!--    <div class="textboxforreviewpage"> -->

			<c:forEach items="${Exam.geteQuestions()}" var="examQuestion"
				begin="0" varStatus="theCount">

				<form action="/resultquestion" method="post">
					<input type="hidden" value="${Exam.geteId()}" name="eId"> <input
						type="hidden" value="${theCount.index}" name="questionNumber">
					<input type="radio" name="radio" value="0" style="display: none;"
						checked="checked">

					<c:choose>
						<c:when
							test="${examQuestion.getChosenAnswers().size().equals(examQuestion.getQuestion().getNumberOfCorrectAnswers())}">

							<c:choose>
								<c:when test="${examQuestion.isAnswered().equals(true)}">
									<c:choose>
										<c:when
											test="${examQuestion.isCorrectAnswered().equals(true)}">
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
		<div class="specialcolumn">
			<form action="/resultspage" method="get">
				<div class="row">
					<button type="submit" class="previousbuttononreviewpage">
						BACK</button>
					<input type="hidden" value="${Exam.geteId()}" name="eId">
				</div>
			</form>
			<form action="/" method="get">
				<div class="row">
					<button type="submit" class="finishboxbuttononresultspage">FINISH</button>
				</div>
			</form>
			<!-- <div class="row">
       <form action="/abort" method="get">
            <button type="submit" class="reviewboxbuttononreviewpage">
                  ABORT
              </button>
              </form>
              </div> -->
		</div>
	</div>

	</div>
	</section>


	<section>
	<div class="row">
		<div class="col collapsedtimeboxforresultsreviewpage">
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

</body>
</html>