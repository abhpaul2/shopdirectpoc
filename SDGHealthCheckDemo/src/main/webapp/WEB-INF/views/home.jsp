<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ShopDirect</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>	
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SHOP DIRECT</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">BRANDS</a></li>
      <li><a href="#">CAREERS</a></li>
      <li><a href="#">CONTACT US</a></li>
      <li><a href="<c:url value="/about"/> "> ABOUT</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
  <h3>Dashboard Prod Application A</h3>
  <p>CPU Usage</p>
   <div class="progress">
	  <div class="progress-bar  progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="70"
	  aria-valuemin="0" aria-valuemax="100" style="width:70%">
	    70%
	  </div>
	</div> 
	<p>Memory Usage</p>
   <div class="progress">
	  <div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="91"
	  aria-valuemin="0" aria-valuemax="100" style="width:91%">
	    91%
	  </div>
	</div>
	<a href="<c:url value="/about"/> " class="btn btn-primary btn-md" > Details </a>
</div>
<div class="container">
  <h3>Dashboard Prod Application B</h3>
  <p>CPU Usage</p>
   <div class="progress">
	  <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="50"
	  aria-valuemin="0" aria-valuemax="100" style="width:50%">
	    50%
	  </div>
	</div> 
	<p>Memory Usage</p>
   <div class="progress">
	  <div class="progress-bar  progress-bar-info progress-bar-striped" role="progressbar" aria-valuenow="66"
	  aria-valuemin="0" aria-valuemax="100" style="width:66%">
	    66%
	  </div>
	</div>
	<a href="<c:url value="/about"/> " class="btn btn-primary btn-md" > Details </a>
</div>
</body>
</html>