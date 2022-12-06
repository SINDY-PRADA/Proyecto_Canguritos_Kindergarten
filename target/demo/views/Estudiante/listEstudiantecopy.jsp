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

<script>
  function Editar(id){
  swal({
  title: "¿Está seguro que desea editar?",
  text: "El registro se editara",
  icon: "warning",
  buttons: true,
  dangerMode: true,
  })
  .then((OK) => {
  if (OK) {
	$.ajax({
	  url:"estudiante?accion=editarEst&idEstudiante="+id,
	  success: function(res){
		console.log(res);
	  }
	});
	swal("Se esta redireccionando...", {
	icon: "success",
	}).then((OK)=>{
			if(OK){
				location.href="estudiante?accion=editarEst&idEstudiante="+id
			}
		  });
  } else {
	swal("Se ha cancelado la operación", {
	icon: "error",
	})
  }
  });
  }
</script>

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
							<a href="estudiante?accion=consultarEst&idEstudiante=18"><img src="./assets/img/perfil.png"> Mi perfil </a>
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
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Estudiante <small> Alumno</small></h1>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					<li><a href="estudiante?accion=editarEst" style="text-decoration:none">Editar</a></li>
					<li><a href="estudiante?accion=consultarEst" style="text-decoration:none">Consultar</a></li>
						
					</ul>
					<div id="myTabContent" class="tab-content">
					  	<div class="tab-pane fade active in" id="estudiante?accion=consultarEstudiante">
							<div class="table-responsive">
								<table class="table table-hover text-center">
									<thead>
										<tr>
										
											<th class="text-center">Nombre</th>
											<th class="text-center">Apellido</th>
											<th class="text-center">Tipo Documento</th>
											<th class="text-center">Documento</th>
											<th class="text-center">Fecha Nacimiento</th>
											<th class="text-center">Rh</th>
											<th class="text-center">Ciudad Nacimiento</th>
											<th class="text-center">Direccion</th>
											<th class="text-center">Sexo</th>
											<!-- <th class="text-center">Padre de Familia</th>
											<th class="text-center">Estado</th>
											<th class="text-center">Cambiar Estado</th> -->
											<th class="text-center">Acción</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="estudianteList" items="${listar}">
										<tr>
											
											<td>${estudianteList.getNombreEstudiante()}</td>
											<td>${estudianteList.getApellidoEstudiante()}</td>
											<td>${estudianteList.getTipoDocumento()}</td>
											<td>${estudianteList.getDocumentoEstudiante()}</td>
											<td>${estudianteList.getFechaNacimiento()}</td>
											<td>${estudianteList.getRhEstudiante()}</td>
											<td>${estudianteList.getCiudadNacimiento()}</td>
											<td>${estudianteList.getDireccionEstudiante()}</td>
											<td>${estudianteList.getSexoEstudiante()}</td>
											 <td>
												<div>
												   <a onclick="Editar([[${estudianteList.getIdEstudiante()}]])">
                                                    <img src="assets/img/Editar.png" style="width: 25px;"></a>
													
													</div>
												</td>
												</tr>
												   </c:forEach>
												   </tbody>
												</table>
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
		<script src="assets/js/sweetalert.min.js"></script>
		<script>
		$.material.init();
	</script>
</body>
</html>