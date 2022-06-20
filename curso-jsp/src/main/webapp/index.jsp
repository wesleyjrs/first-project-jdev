<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
 
<title>Insert title here</title>
</head>
<body>
		<div class="row" style="margin-top: 15%;">
			
			<h3 style="text-align: center;">Curso JSP</h3>
			
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<form class="row g-3 needs-validation" action="ServletLogin" method="post" style="margin-top: 10%;"  novalidate>
					<input type="hidden" value="<%= request.getParameter("url") %>" name="url" class="form-control"/>
				 	
					  <div class="col-md-12">
					  	<!--   <label class="form-label">Login</label>-->
					    <input name="login" type="text" class="form-control" placeholder="Login" required/>
					    <div class="invalid-feedback">
					        Informe o Login
					    </div>
					 
    
					  </div>
					  <br />
					  <div class="col-md-12">
					  	<!--  <label class="form-label">Password</label>  -->
					    <input name="senha" type="password" class="form-control" placeholder="Password" required/>
					    <div class="invalid-feedback">
					        Informe a senha
					    </div>
					  </div>
					  <br />
					  <div style="text-align: center;">
					  	<input type="submit" class="btn btn-primary btn-md" aling="center" value="Acessar" />
					  </div>
					
				</form>
			</div>
			<div class="col-md-4"></div>
			
		</div>
		
		
		
		<h5 style="color: red; text-align: center">${msg}</h5>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
			<script type="text/javascript">
	
		( function () {
		  'use strict'
	
		  // Fetch all the forms we want to apply custom Bootstrap validation styles to
		  var forms = document.querySelectorAll('.needs-validation')
	
		  // Loop over them and prevent submission
		  Array.prototype.slice.call(forms)
		  .forEach(function (form) {
		    form.addEventListener('submit', function (event){
		      if (!form.checkValidity()) {
		        event.preventDefault()
		        event.stopPropagation()
		      }
	
		      form.classList.add('was-validated')
		    }, false)
		  })
		})()
	
	</script>
</body>
</html>