<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>
     <title>The Disclaimer Page</title>
     <link rel="stylesheet" type="text/css" href="../../css/style.css"></link>
     <meta name="viewport" content="width=device-width, height=device-hieght, initial-scale=1.0">

</head>
<body class="background">

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
 

	 <section class ="container">
      <div class="row">
       <div class="col col3">
	    <div class="box">
	     <h1 class="section-header">Legal Disclaimer</h1>
	    </div>
	   </div>
      </div>
	  
      <div class="row">
       <div class="col col8">
	    <div class="textbox">
	     <h4>The following is a property of FDM Frankfurt and shall not be shared with any third parties. 
		 Third parties include trainees from other FDM streams and academies. 
		 The document shall not be distributed internally or externally. 
		 Whilst every care has been taken by FDM to ensure that the information contained in this 
		 publication is correct and complete, it is possible that this is not the case. 
		 FDM holds no guarantee for the correctness of the answers. FDM is not liable for any 
		 damage which has occurred or may occur as a result of or in any respect related to the use of this publication. 
		 FDM may change or terminate this publication at any time without further notice and shall not be responsible 
		 for any consequence(s) arising there from. FDM does not allow copy, distribution, reselling and reproduction of 
		 full or any part of the document. Strict action will be taken including lawsuit against violation. 
		 All other trademarks are the property of their respective owners. All rights reserved.</h4>
	    </div>
	   </div>
	   <form action="/chooseexam" method="get">
	    <button type="submit" class="textboxbutton">
		     NEXT
		</button>
		</form>
      </div>
	 </section>
	 <div class="row">
	 <!-- Display the countdown timer in an element -->
		<p id="demo"></p>
		
	 </div>
</body>
</html>