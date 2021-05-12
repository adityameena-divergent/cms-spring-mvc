<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

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

						<li class="nav-item"><a class="nav-link active disabled"
							aria-current="page" href="patientinsert">Insert</a></li>

						<li class="nav-item"><a class="nav-link" href="patientsearch">Search</a></li>

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


	<c:set var="patient" value="${patient}" />


	<div class="text-center mt-5">
		<form action="patientupdate" method="post"
			style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Update Patient Data</h1>

			<div class="mb-2 row">
				<label for="id" class="col-sm-2 col-form-label">Id</label>
				<div class="col-sm-10">
					<input readonly id="id" type="number" class="form-control"
						placeholder="Patient Id" name="patient_id" value="${patient.id}" required autofocus>
				</div>
			</div>


			<div class="mb-2 row">
				<label for="name" class="col-sm-2 col-form-label">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" placeholder="Patient Name"
						id="name" name="patient_name" value="${patient.name}" required autofocus>
				</div>
			</div>

			<div class="mb-2 row">
				<label for="gender" class="col-sm-2 col-form-label">Gender</label>
				<div class="col-sm-10" id="gender">
				
					Male <input type="radio" name="gender" value="Male">
					Female <input type="radio" name="gender" value="Female">
				</div>
			</div>

			<div class="mb-2 row">
				<label for="age" class="col-sm-2 col-form-label">Age</label>
					<div class="col-sm-10">
						<input type="number" id="age" class="form-control"
							placeholder="Patient Age" name="age" value="${patient.age}" required autofocus> 
					</div>
			</div>
			
			
			<div class="mb-2 row">
				<label for="weight" class="col-sm-2 col-form-label">Weight</label> 
					<div class="col-sm-10">
						<input type="number" id="weight" class="form-control"
						placeholder="Patient Weight" name="weight" value="${patient.weight}" required autofocus>
					</div>
			</div>
			


			<div class="mb-2 row">
				<label for="contact" class="col-sm-2 col-form-label">Contact Number</label>
					<div class="col-sm-10">
						<input type="number" class="form-control"
							placeholder="Contact Number" id="contact" name="contact_number" value="${patient.contactNumber}"	required autofocus>
					</div> 
			</div>	
			
			
			<div class="mb-2 row">	
			<label for="address" class="col-sm-2 col-form-label">Address</label> 
				<div class="col-sm-10">
					<input type="text" class="form-control" placeholder="Address" id="address" name="address" value="${patient.address}" required autofocus>
				</div>
			</div>


			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block" type="submit">Update</button>
			</div>

		</form>
	</div>


</body>
</html>

