<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Results Page</title>
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
	</div>


	<section class="container">
	<div class="row">
		<div class="col col3">
			<div class="box">
				<h1 class="section-header">Results</h1>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col col8">
			<div class="textboxforresultspage">
				<h4>
					Number of Questions answered correct ${ right } <br> Number of
					Questions answered wrong ${ wrong } <br> ${ percentage }% ${ mark }
				</h4>
			</div>
		</div>
		<div class="specialcolumn">
			<form action="/" method="get">
				<div class="row">
					<button type="submit" class="finishboxbuttononresultspage">FINISH</button>
				</div>
			</form>
			<form action="resultsreviewpage" method="post">
				<div class="row">
					<button type="submit" class="reviewboxbuttononreviewpage">REVIEW</button>
				</div>
				<input type="hidden" value="${Exam.geteId()}" name="eId">
			</form>
		</div>
	</div>
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
		document.getElementById("demo").innerHTML ="<h3>"+ hours +"h "+  minutes + "m " + seconds + "s " + "</h3>";
				
		</script>

		</div>
	</div>
	</section>
</body>
</html>