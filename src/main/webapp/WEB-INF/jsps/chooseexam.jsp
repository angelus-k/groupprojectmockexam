<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Choose Exam</title>
<link rel="stylesheet" href="disclaimer.css"></link>
<link rel="stylesheet" type="text/css" href="../../css/style.css"></link>

</head>
<body class="background no-scroll">

	<div class="row">
		<div class="col FDMbox">
			<a href="/"><img  class="fdm-logo" src="../../img/FDM_Logo.JPG" /></a>
		</div>
	</div>
	<div class="row header-row">
		<h1 class="userhome">Choose exam</h1>
			
			<form action="/logout">
				<button id="goback" class="button button2">Logout</button>
			</form>
			<form action="/">
				<button id="goback" class="button button2">Home</button>
			</form>
	</div>	



	<section class="container">
	<!-- <div class="row">
		<div class="col col3">
			<div class="box">
				<h1 class="section-header">Choose Exam</h1>
			</div>
		</div>
	</div>
	 -->
	
	<div class="row">
	<form action="/firstquestionpage" method="POST">
		<div class="exam-instructions">
			<div class="textbox">
				<div class="custom-select" style="width: 200px;">
					<select name="toeId">
						<option value="null">- Select the Exam -</option>
						<c:forEach items="${TypeOfExamList}" var="typeOfExam">
						<option value="${typeOfExam.typeId}">${typeOfExam.examType}</option>
						</c:forEach>
					</select>
				</div>
				
				<h4>By clicking the "Start" button, the exam will automatically
					start and the timer at bottom right will start running. From there
					you will have 60 minutes time to answer 40 questions. Each question
					has only one right answer among the 4 choices presented. The
					questions can be navigated back and forth through the "Next" and
					"Previous" button, and through the review page (accessible from the
					"Review" button). The exam is complete when the time is collapsed
					or the "Complete" button in the review page is clicked and
					confirmed. After completing the exam, answers cannot be change.
					Upon completion the results will be displayed.</h4>
			</div>
		</div>
		
			<button type="submit" class="startbuttononchooseexampage">
				START</button>
		</form>
	</div>
	</section>

	<script>
		var x, i, j, selElmnt, a, b, c;
		/*look for any elements with the class "custom-select":*/
		x = document.getElementsByClassName("custom-select");
		for (i = 0; i < x.length; i++) {
			selElmnt = x[i].getElementsByTagName("select")[0];
			/*for each element, create a new DIV that will act as the selected item:*/
			a = document.createElement("DIV");
			a.setAttribute("class", "select-selected");
			a.innerHTML = selElmnt.options[selElmnt.selectedIndex].innerHTML;
			x[i].appendChild(a);
			/*for each element, create a new DIV that will contain the option list:*/
			b = document.createElement("DIV");
			b.setAttribute("class", "select-items select-hide");
			for (j = 1; j < selElmnt.length; j++) {
				/*for each option in the original select element,
				create a new DIV that will act as an option item:*/
				c = document.createElement("DIV");
				c.innerHTML = selElmnt.options[j].innerHTML;
				c
						.addEventListener(
								"click",
								function(e) {
									/*when an item is clicked, update the original select box,
									and the selected item:*/
									var y, i, k, s, h;
									s = this.parentNode.parentNode
											.getElementsByTagName("select")[0];
									h = this.parentNode.previousSibling;
									for (i = 0; i < s.length; i++) {
										if (s.options[i].innerHTML == this.innerHTML) {
											s.selectedIndex = i;
											h.innerHTML = this.innerHTML;
											y = this.parentNode
													.getElementsByClassName("same-as-selected");
											for (k = 0; k < y.length; k++) {
												y[k].removeAttribute("class");
											}
											this.setAttribute("class",
													"same-as-selected");
											break;
										}
									}
									h.click();
								});
				b.appendChild(c);
			}
			x[i].appendChild(b);
			a.addEventListener("click", function(e) {
				/*when the select box is clicked, close any other select boxes,
				and open/close the current select box:*/
				e.stopPropagation();
				closeAllSelect(this);
				this.nextSibling.classList.toggle("select-hide");
				this.classList.toggle("select-arrow-active");
			});
		}
		function closeAllSelect(elmnt) {
			/*a function that will close all select boxes in the document,
			except the current select box:*/
			var x, y, i, arrNo = [];
			x = document.getElementsByClassName("select-items");
			y = document.getElementsByClassName("select-selected");
			for (i = 0; i < y.length; i++) {
				if (elmnt == y[i]) {
					arrNo.push(i)
				} else {
					y[i].classList.remove("select-arrow-active");
				}
			}
			for (i = 0; i < x.length; i++) {
				if (arrNo.indexOf(i)) {
					x[i].classList.add("select-hide");
				}
			}
		}
		/*if the user clicks anywhere outside the select box,
		 then close all select boxes:*/
		document.addEventListener("click", closeAllSelect);
	</script>

</body>
</html>