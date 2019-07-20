<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Add exam</h1>
		<div>
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
		</div>
	</div>
	
	<table>
			<tr>
			<c:forEach items = "${exam}" var="firstexam">
										
				<td> ${firstexam.question} </td>		 
				
						<c:forEach items="${firstexam.aList}" var="answer">
						
							<td>${answer.answer}</td>
						
						</c:forEach>
						
			</c:forEach>
					
			</tr>
		</table>
</body>
</html>