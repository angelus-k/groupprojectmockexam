<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>
<title>Insert title here</title>
</head>
<body class="background no-scroll always">

<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome"></h1>
		<form action="/">
			<button id="goback" class="button button2">Home</button>
		</form>
</div>
	
<div class="row">
	<h1>Do you really want to delete the exam?</h1>
	<form action="/delete/${typeId}" method=POST>
		<button class="button" id="delete">Delete</button>
	</form>

	<form action="/manageExam">
		<button class="button id="not delete">No</button>
	</form>
</div>	

</body>
</html>