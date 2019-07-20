<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>userhome</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="disclaimer.css"></link>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>
</head>
<body class="background no-scroll always">



	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
	
		<form action="/logout">
			<button id="goback" class="button button2">Logout</button>
		</form>
		
	</div>

	<div class="row">
		<h2>Welcome to the Mock Exam Generator!</h2>
		<div>
			<form action="/chooseexam" method="GET">
				<button class="button" onclick="location.href='/exam/{examId}'">Take an
					Exam</button>
			</form>
			<form action="/userResultspage" method="GET">
				<button class="button">Personal progress</button>
			</form>
		
		<form action="/userProfile/${userToShow.id}" method="GET">
			<button class="button">Personal Information</button>
		</form>
		<form action="viewStatistics">
			<button class="button button2">Exam statistics</button>
		</form>
		<a class="button" style="border-radius: 3px; font: sans-serif;" href="https://www.youtube.com/watch?v=8YGlzSl6cxU" target="_blank">AMAZING :)</a>
		</div>
	</div>
	
</body>
</html>