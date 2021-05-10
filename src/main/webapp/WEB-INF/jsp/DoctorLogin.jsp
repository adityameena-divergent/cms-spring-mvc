<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>CMS</title>
<!-- CSS only -->




<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<style>
input[type="email"] {
	border-bottom-left-radius: 0px;
	border-bottom-right-radius: 0px;
}

input[type="password"] {
	border-top-left-radius: 0px;
	border-top-right-radius: 0px;
}
</style>

</head>
<body
	style="background: #fff url(resources/images/background.jpg) center center/cover no-repeat fixed;">


	<header>

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">

				<a class="navbar-brand" href="home">Clinic Management
					System</a>

				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link" aria-current="page"
							href="home">Home</a></li>

						<li class="nav-item"><a class="nav-link"
							href="adminlogin">Admin</a></li>

						<li class="nav-item"><a class="nav-link active disabled"
							href="#">Doctor</a></li>

					</ul>
					<div class="d-flex">

						<h3>Divergent Software Labs</h3>

					</div>
				</div>
			</div>
		</nav>
	</header>


	<div class="text-center mt-5">
		<form action="#" style="max-width: 480px; margin: auto;">

			<h1 class="h3 mb-3 font-weight-normal">Doctor Login</h1>
			<input type="text" id="username" class="form-control"
				placeholder="Username" required autofocus> <input
				type="password" id="password" class="form-control"
				placeholder="Password">

			<div class="mt-3">
				<button class="btn btn-lg btn-primary btn-block">Login</button>
			</div>

		</form>
	</div>


</body>
</html>

