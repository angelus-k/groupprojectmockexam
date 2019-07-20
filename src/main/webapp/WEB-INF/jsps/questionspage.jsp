<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Questions Page</title>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>
<script>

var input = document.getElementById('myInput');

if(input.value.length == 0){
    input.value = "null";
}

</script>
<script>
function myFunction() {
  var popup = document.getElementById("myPopup");
  popup.classList.toggle("show");
}
</script>


</head>


<body class="background always">
	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		
		<form action="/logout">
			<button id="goback" class="button button2">Logout</button>
		</form>
		<button id="goback" id="myPopup" class="button button2 popup"
			onclick="myFunction()">Report</button>
	</div>

	<div class="popup">
		<!-- 
  		<span class="popuptext" >Popup text...</span>
  		-->
		<div class="popuptext" id="myPopup">
			<form action="/nextquestion" method="post">
				<input type="text" placeholder="Report" id="myInput"
					style="width: 13em; height: 3em;" name="reportText"></input>
				<!-- 
			<input id="checkbox" type="radio" name="reportText" value="0" style="display: none;" checked="checked">
			 -->
				<input type="hidden" value="${questionNumber -1}"
					name="questionNumber"> <input id="checkbox" type="radio"
					name="radio" value="0" style="display: none;" checked="checked">
				<input type="hidden" value="${Exam.geteId()}" name="eId">
				<button type="submit" id="checkBtn"
					class="nextboxbuttononfirstquestionpage btn-question"
					value="Get Selected Values">Report question</button>
			</form>
		</div>
	</div>


	<section class="container">

	<div class="row">
		<div class="question-instructions">
			<div class="textboxforquestionspage">
				Question Number: ${ questionNumber +1} <br> ${ Exam.geteQuestions().get(questionNumber).getQuestion().getQuestionText() }
			</div>
		</div>
	</div>



	</section>
	<section class="container">
	<div class="row">
		<form action="/nextquestion" method="post">
			<div class="question-instructions">

				<input id="checkbox" type="radio" name="radio" value="0"
					style="display: none;" checked="checked"> <input
					type="hidden" value="${Exam.geteId()}" name="eId"> <input
					type="hidden" value="${questionNumber}" name="questionNumber">

				<c:forEach
					items="${Exam.geteQuestions().get(questionNumber).getQuestion().getPossibleAnswers()}"
					var="answer">
					<c:choose>
						<c:when
							test="${Exam.geteQuestions().get(questionNumber).getChosenAnswers().contains(answer)}">
							<label class="containerforradiobutton"> ${ answer.answerText }
								<input type="checkbox" name="radio" value="${answer.aId}"
								checked="checked"> <span class="checkmark"></span>
							</label>
						</c:when>
						<c:otherwise>
							<label class="containerforradiobutton"> ${ answer.answerText }
								<input type="checkbox" name="radio" value="${answer.aId}">
								<span class="checkmark"></span>
							</label>
						</c:otherwise>
					</c:choose>


				</c:forEach>


			</div>
			</div>

			<div class="questionpage-button-container" style="width:100%">
				<div class="row">
				<c:set var="zero" value="${0}"/>
				
					<button type="submit"
						class="reviewboxbuttononreviewpage btn-question" style="width:33%"
						formaction="/review" value="Get Selected Values">REVIEW</button>
					<button type="submit" id="checkBtn"
						class="nextboxbuttononfirstquestionpage btn-question" style="width:33%"
						value="Get Selected Values">NEXT</button>
				<c:choose>
				<c:when test="${questionNumber != zero }" >		
					<button type="submit" id="checkBtn"
						class="nextboxbuttononfirstquestionpage btn-question" style="width:33%"
						value="Get Selected Values" formaction="/previousquestion">
						PREVIOUS</button>
				</c:when>
				</c:choose>
				</div>
			</div>

			<!-- 
			<div class="specialcolumn">
				<div class="row">
					<button type="submit" id="checkBtn"
						class="nextboxbuttononfirstquestionpage"
						value="Get Selected Values">NEXT</button>
				</div>

				<div class="row">
					<button type="submit" class="reviewboxbuttononreviewpage"
						formaction="/review" value="Get Selected Values">REVIEW</button>
				</div>
				 -->

		</form>
	</div>

	
	</section>

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
