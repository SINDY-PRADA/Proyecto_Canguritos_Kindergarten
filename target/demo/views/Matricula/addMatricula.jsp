<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Canguritos Kindergarten</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="assets/css/main.css">
	<link rel="stylesheet" href="assets/css/estilos.css">

	  <!-- Favicons -->
	  <link href="assets/img/canguro.png" rel="icon">
	  
</head>
<body>
	<!-- SideBar -->
	<section class="full-box cover dashboard-sideBar">
		<div class="full-box dashboard-sideBar-bg btn-menu-dashboard"></div>
		<div class="full-box dashboard-sideBar-ct">
			<!--SideBar Title -->
			<div class="full-box text-uppercase text-center text-titles dashboard-sideBar-title">
				Canguritos Kindergarten <i class="zmdi zmdi-close btn-menu-dashboard visible-xs"></i>
			</div>
			<!-- SideBar User info -->
			<div class="full-box dashboard-sideBar-UserInfo">
				<figure class="full-box">
					<img src="assets/img/Niña.png" alt="UserIcon">
					<figcaption class="text-center text-titles">Ana Lopez</figcaption>
				</figure>
				<ul class="full-box list-unstyled text-center">
					<li>
					</li>
					<li>
						<a href="login.jsp" class="btn-exit-system">
							<i class="zmdi zmdi-power"></i>
						</a>
					</li>
				</ul>
			</div>
			<!-- SideBar Menu -->
			<ul class="list-unstyled full-box dashboard-sideBar-Menu">
				<li>
					<a href="dashboardestudiante.jsp">
						<i class="zmdi zmdi-view-dashboard zmdi-hc-fw"></i> Inicio
					</a>
				</li>
	
				<li>
					<a href="#!" class="btn-sideBar-SubMenu">
						<i class="zmdi zmdi-account-add zmdi-hc-fw"></i> Funcionalidades <i class="zmdi zmdi-caret-down pull-right"></i>
					</a>
					<ul class="list-unstyled full-box">
						<li>
							<a href="matricula?accion=consultarMatriculaEst"><img src="./assets/img/subir.png"> Subir documentos </a>
						</li>
						<li>
							<a href="estudiante?accion=consultarEst"><img src="./assets/img/perfil.png"> Mi perfil </a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
	</section>

	<!-- Content page-->
	<section class="full-box dashboard-contentPage">
		<!-- NavBar -->
		<nav class="full-box dashboard-Navbar">
			<ul class="full-box list-unstyled text-right">
				<li class="pull-left">
					<a href="#!" class="btn-menu-dashboard"><i class="zmdi zmdi-more-vert"></i></a>
				</li>
				<li>
					<a href="./assets/docs/Constancia.pdf" download style="text-decoration:none"> Constancia </a>
				</a>
			</li>
		</ul>
	</nav>
		<!-- Content page -->
		<div class="container-fluid">
			<div class="page-header">
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Matrícula <small>Estudiante</small></h1>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
						<li><a href="matricula?accion=añadirMatricula" style="text-decoration:none">Agregar</a></li>
             			<li><a href="matricula?accion=editarMatriculaEts" style="text-decoration:none">Editar</a></li>
              			<li><a href="matricula?accion=consultarMatriculaEst" style="text-decoration:none">Consultar</a></li>

						
					</ul>
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in">
							<div class="container-fluid">
								<div class="row">
									<div class="formulario__grupo-input">
									    <form action="matricula" method="POST" class="formulario" id="formulario">

											<div class="formulario__grupo" id="grupo__nombreEstudiante">
												<label for="nombreEstudiante" class="formulario__label">Nombre del Estudiante</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="nombreEstu" id="nombreEstu" placeholder="Ruth">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Debe ser de 4 a 16 dígitos y solo puede contener letras</p>
											</div>

											<div class="formulario__grupo" id="grupo__apellidoEstudiante">
												<label for="apellidoEstudiante" class="formulario__label">Apellido del Estudiante</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="apellidoEstu" id="apellidoEstu" placeholder="Rodriguez">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Debe ser de 4 a 16 dígitos y solo puede contener letras</p>
											</div>

											<script>
												function cambiar(){
												var pdrs = document.getElementById('file-upload').files[0].name;
												document.getElementById('info').innerHTML = pdrs;
											}
											</script>

											<div class="formulario__grupo">
												<label class="formulario__label">Archivo PDF</label>
												<label for="file-upload" class="subir">
													<i class="fas fa-cloud-upload-alt"></i> Subir archivo
												</label>
												<input id="file-upload" onchange='cambiar()'accept="application/pdf" name="Archivo" id="Archivo" type="file" style='display: none;'/>
												<div id="info"></div> 
											</div>

											<div class="formulario__grupo">
												<label class="formulario__label">Observacion del Estudiante</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="observacionEstudiante" id="observacionEstudiante">
												</div>
											</div>
											
											<div class="formulario__grupo">
												<label class="formulario__label">Observación de la Rectora</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="observacionRectora" id="observacionRectora" readonly>
												</div>
											</div>

											<div class="formulario__grupo">
												<label class="formulario__label">Año matrículado</label>
												<div class="formulario__grupo-input">
													<input type="number" class="formulario__input" name="anolectivo" id="anolectivo">
												</div>
											</div>

											<div class="formulario__grupo">
												<label class="formulario__label">Estudiante matrículado</label>
												<div class="formulario__grupo-input">
													<input type="number" class="formulario__input" name="estu" id="estu">
												</div>
											</div>
											<br>
											<div class="formulario__grupo formulario__grupo-btn-enviar">
												<button type="submit" class="btn btn-info btn-raised btn-sm" name="accion" value="add" style="height: 40px;" onclick="return ConfirmRegistro()" onclick="return valtel()""><i class="zmdi zmdi-floppy"></i> AGREGAR</button>
											</div> 
									    </form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!--====== Scripts -->
	<script src="assets/js/jquery-3.1.1.min.js"></script>
	<script src="assets/js/sweetalert2.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/material.min.js"></script>
	<script src="assets/js/ripples.min.js"></script>
	<script src="assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="assets/js/main.js"></script>
	<script src="assets/js/validaciones/validarEstudiante.js"></script>
	<script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>

	<script>
		$.material.init();
	</script>
</body>
</html>
































