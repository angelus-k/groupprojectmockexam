<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Review Page</title>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>

</head>
<body class="background no-scroll always">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Review</h1>
		<form action="/logout">
			<button id="goback" class="button button2">Logout</button>
		</form>
	</div>


	<section class="container">
	<div class="row">
		<div class="col columnforreviewpage">
			<!-- 	 <div class="textboxforreviewpage"> -->

			<c:forEach items="${Exam.geteQuestions()}" var="examQuestion"
				begin="0" varStatus="theCount">

				<form action="/previousquestion" method="post">
					<input type="hidden" value="${Exam.geteId()}" name="eId">
					<input type="hidden" value="${theCount.index+1}"
						name="questionNumber"> <input type="radio" name="radio"
						value="0" style="display: none;" checked="checked">
					<c:choose>
						<c:when
							test="${examQuestion.isAnswered()==true}">
							<button class="questionbox" type="submit" name="Question">
								&#9745 Question ${ theCount.index +1}</button>
						</c:when>
						<c:otherwise>
							<button class="questionbox" type="submit" name="Question">
								&#x2610 Question ${ theCount.index +1 }</button>
						</c:otherwise>
					</c:choose>
				</form>
			</c:forEach>

			<!-- </div> -->
		</div>
		<div class="specialcolumn">
			<form action="/previousquestion" method="post">
				<div class="row">
					<button type="submit" class="previousbuttononreviewpage">
						BACK</button>
					<input type="hidden" value="${questionNumber+1}"
						name="questionNumber"> <input type="hidden"
						value="${Exam.geteId()}" name="eId"> <input
						type="radio" name="radio" value="0" style="display: none;"
						checked="checked">
				</div>
			</form>
			<div class="row">
				<form action="/resultspage" method="get">
					<button type="submit" class="nextboxbuttononreviewpage">
						COMPLETE</button>
					<input type="hidden" value="${Exam.geteId()}" name="eId">
				</form>
			</div>
			<div class="row">
				<form action="/abort" method="get">
					<button type="submit" class="reviewboxbuttononreviewpage"
						onclick="return confirm('Do you really want to abort the exam?')">
						ABORT</button>
				</form>
			</div>
		</div>
	</div>

	</div>
	</section>

	<section>
	<div class="row">
		<div class="col collapsedtimeboxforreviewpage">
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
		function test2() {
		
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
		
		  // If the count down is finished, write some text 
		  if (distance < 0) {
		    clearInterval(x);
		    document.getElementById("demo").innerHTML = "Time is up";
		  }
		}
		test2();
		var x = setInterval(function test() {
		
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
		
		  // If the count down is finished, write some text 
		  if (distance < 0) {
		    clearInterval(x);
		    document.getElementById("demo").innerHTML = "Time is up";
		    var eId=[[${Exam.geteId()}]];
		    window.location.replace("/resultspage?eId="+ eId);
		  }
		}, 1000);
		</script>

		</div>
	</div>
	</section>

</body>
</html>