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
					<img src="assets/img/avatar.jpg" alt="UserIcon">
					<figcaption class="text-center text-titles">Angélica Palacios</figcaption>
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
					<a href="dashboard.jsp">
						<i class="zmdi zmdi-view-dashboard zmdi-hc-fw"></i> Inicio
					</a>
				</li>
	
				<li>
					<a href="#!" class="btn-sideBar-SubMenu">
						<i class="zmdi zmdi-account-add zmdi-hc-fw"></i> Funcionalidades <i class="zmdi zmdi-caret-down pull-right"></i>
					</a>
					<ul class="list-unstyled full-box">
						<li>
							<a href="matricula?accion=consultarMatricula"><i class="zmdi zmdi-folder"></i> Matriculas </a>
						</li>
						<li>
							<a href="estudiante?accion=consultarEstudiante"><i class="zmdi zmdi-face"></i> Estudiantes </a>
						</li>
						<li>
							<a href="acudiente?accion=consultarAcudiente"><i class="zmdi zmdi-accounts"></i> Acudientes </a>
						</li>
						<li>
							<a href="usuario?accion=consultarUsuario"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Usuarios </a>
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
					<a href="" class="btn-search">
						<i class="zmdi zmdi-search"></i>
					</a>
				</li>
			
			</ul>
		</nav>
		<!-- Content page -->
		<div class="container-fluid">
			<div class="page-header">
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Acudiente <small>Administrador</small></h1>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
						<li><a href="acudiente?accion=añadirAcudiente" style="text-decoration:none">Agregar</a></li>
						<li><a href="acudiente?accion=editarAcudiente" style="text-decoration:none">Editar</a></li>
						<li><a href="acudiente?accion=consultarAcudiente"style="text-decoration:none">Consultar</a></li>

						
					</ul>
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in">
							<div class="container-fluid">
								<div class="row">
									<div class="formulario__grupo-input">
									    <form action="acudiente" method="POST" class="formulario" id="formulario">

											<div class="formulario__grupo" id="grupo__parentescoAcudiente">
												<label for="parentescoAcudiente" class="formulario__label">Parentesco</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="parentescoAcudiente" id="parentescoAcudiente" placeholder="Mamá">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Debe ser de 4 a 16 dígitos y solo puede contener letras</p>
											</div>

											<div class="formulario__grupo" id="grupo__nombreAcudiente">
												<label for="nombreAcudiente" class="formulario__label">Nombre</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="nombreAcudiente" id="nombreAcudiente" placeholder="Carolina">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Debe ser de 4 a 16 dígitos y solo puede contener letras</p>
											</div>

                      							<div class="formulario__grupo" id="grupo__apellidoAcudiente">
												<label for="apellidoAcudiente" class="formulario__label">Apellido</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="apellidoAcudiente" id="apellidoAcudiente" placeholder="Perez">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Debe ser de 4 a 16 dígitos y solo puede contener letras</p>
											</div>

											<div class="formulario__grupo">
												<label class="formulario__label">Tipo de documento</label>
												<div class="formulario__grupo-input">
													<select class="formulario__input" name="tipoDocumento" id="tipoDocumento">
														<option class="formulario__input" value="CC">CC</option>
														<option class="formulario__input" value="CE">CE</option>
														<option class="formulario__input" value="NIP">NIP</option>
                            							<option class="formulario__input" value="NIP">PAP</option>
													</select>
												</div>
											</div>

											<div class="formulario__grupo" id="grupo__documentoAcudiente">
												<label for="documentoAcudiente" class="formulario__label">Número de documento</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="documentoAcudiente" id="documentoAcudiente" placeholder="1032752254">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Solo puede contener números, máximo 10 dígitos</p>
											</div>

											<div class="formulario__grupo" id="grupo__profesionAcudiente">
												<label for="profesionAcudiente" class="formulario__label">Profesión</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="profesionAcudiente" id="profesionAcudiente" placeholder="Enfermera">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
												<p class="formulario__input-error">Debe ser de 5 a 10 dígitos y solo puede contener letras</p>
											</div>

											<div class="formulario__grupo" id="grupo__telefonoAcudiente">
												<label for="telefonoAcudiente" class="formulario__label">Teléfono</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="telefonoAcudiente" id="telefonoAcudiente" placeholder="3212974072">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
													</div>
													<p class="formulario__input-error">Solo puede contener numeros y el maximo son 10 dígitos</p>
												</div> 

												<div class="formulario__grupo">
												<label class="formulario__label">Dirección</label>
												<div class="formulario__grupo-input">
													<input type="text" class="formulario__input" name="direccionAcudiente" id="direccionAcudiente">
													<i class="formulario__validacion-estado fas fa-times-circle"></i>
												</div>
											</div>
						
                      						<div class="formulario__grupo" id="grupo__correoAcudiente">
				                				<label for="correoAcudiente" class="formulario__label">Correo Electrónico</label>
				                				<div class="formulario__grupo-input">
					                				<input type="email" class="formulario__input" name="correoAcudiente" id="correoAcudiente" placeholder="CarolinaRojas@gmail.com">
					                				<i class="formulario__validacion-estado fas fa-times-circle"></i>
				                					</div>
				               					 <p class="formulario__input-error">Solo puede contener letras, numeros, puntos, guiones y guion bajo.</p>
			                				</div>
	
											<div class="formulario__grupo">
												<label class="formulario__label">Estado</label>
												<div class="formulario__grupo-input">
													<select class="formulario__input" name="estadoAcudiente" id="estadoAcudiente">
														<option class="formulario__input" value="false">Inactivo</option>
														<option class="formulario__input" value="true">Activo</option>
													</select>
												</div>
											</div>
											
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
	<script src="assets/js/validaciones/validarAcudiente.js"></script>
	<script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>

	<script>
		$.material.init();
	</script>
</body>
</html>



