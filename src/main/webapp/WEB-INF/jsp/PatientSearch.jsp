<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%@ page import="com.divergentsl.cms.entity.Patient"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>CMS</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<!--  <link rel="stylesheet" href="resources/styles.css">
-->

</head>
<body
	style="background: #fff url(resources/images/background.jpg) center center/cover no-repeat fixed;">


	<header>

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">

				<a class="navbar-brand" href="adminmenu">Patient Menu</a>

				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">

						<li class="nav-item"><a class="nav-link"
							aria-current="page" href="patientinsert">Insert</a></li>

						<li class="nav-item"><a class="nav-link disabled active" href="#">Search</a></li>

						<li class="nav-item"><a class="nav-link" href="patientlist">List
								All</a></li>

						<li class="nav-item"><a class="nav-link" href="#">Update</a></li>


					</ul>
					<div class="d-flex">

						<h3>Divergent Software Labs</h3>

					</div>
				</div>
			</div>
		</nav>
	</header>


	<div class="text-center mt-5">
		<form action="patientsearch" method="get"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Insert Patient Data</h1>

			<input type="number" class="form-control" placeholder="Patient Id"
				name="patientid" required autofocus>

			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Search</button>
			</div>

		</form>
		
		<c:set var="patient" value="${patient}" />
		
		<c:if test="${not empty patient['class'].declaredFields}">
				

		<div>
			
			<ul class="list-group list-group-horizontal">
				<li class="list-group-item">Patient Id</li>
				<li class="list-group-item">${patient.id}</li>
			</ul>
			
			<ul class="list-group list-group-horizontal">
				<li class="list-group-item">Patient Name</li>
				<li class="list-group-item">${patient.name}</li>
			</ul>
			
			<ul class="list-group list-group-horizontal">
				<li class="list-group-item">Patient Age</li>
				<li class="list-group-item">${patient.age}</li>
			</ul>
			
			<ul class="list-group list-group-horizontal">
				<li class="list-group-item">Patient Weight</li>
				<li class="list-group-item">${patient.weight}</li>
			</ul>
			
			
		</div>
		</c:if>


	</div>


</body>
</html>

