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
	<link href="https://cdn.jsdelivr.net/npm/alertifyjs@1.11.0/build/css/alertify.min.css" rel="stylesheet"/>
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
	  url:"matricula?accion=editarMatricula&idMatricula="+id,
	  success: function(res){
		console.log(res);
	  }
	});
	swal("Se esta redireccionando...", {
	icon: "success",
	}).then((OK)=>{
			if(OK){
				location.href="matricula?accion=editarMatricula&idMatricula="+id
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
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Matrículas <small>Administrador</small></h1>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					<li><a href="matricula?accion=editarMatricula" style="text-decoration:none">Editar</a></li>
					<li><a href="matricula?accion=consultarMatricula" style="text-decoration:none">Consultar</a></li>
						
					</ul>
					<div id="myTabContent" class="tab-content">
					  	<div class="tab-pane fade active in" id="matricula?accion=consultarMatricula">
							<div class="table-responsive">
								<table class="table table-hover text-center">
									<thead>
										<tr>
											<th class="text-center">No.Estudiante</th>
											<th class="text-center">Fecha - Hora</th>
											<th class="text-center">Nombre Estudiante</th>
											<th class="text-center">Apellido Estudiante</th>
											<th class="text-center">Observación Estudiante</th>
											<th class="text-center">Observación Rectora</th>
											<th class="text-center">Año Matriculado</th>
											<th class="text-center">Estudiante Matriculado</th>
											<th class="text-center">Estado</th>
											<th class="text-center">Acción</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="matriculaLists" items="${listar}">
										<tr>
											<td>${matriculaLists.getIdMatricula()}</td>
											<td>${matriculaLists.getFechaMatricula()}</td>
											<td>${matriculaLists.getNombreEstu()}</td>
											<td>${matriculaLists.getApellidoEstu()}</td>
											<td>${matriculaLists.getObservacionEstu()}</td>
											<td>${matriculaLists.getObservacionRectora()}</td>
											
											<td>
												<c:if test="${matriculaList.getIdEstudiante() %2 == 0}">
												<span>2022</span>
												</c:if>
											</td>	
											<td>
												<c:if test="${matriculaList.getIdAnolectivo() %2 == 0}">
												<span>Jardín</span>
												</c:if>
												<c:if test="${matriculaList.getIdAnolectivo() %2 != 0}"> 
												<span>Pre-Jardín</span>
												</c:if>
											</td>
											<td>${matriculaLists.getEstadoMatricula()}</td>
											 <td>
												<div>
													<a onclick="Editar([[${matriculaLists.getIdMatricula()}]])">
                                                        <img src="assets/img/Editar.png" style="width: 25px;"></a>

													<a href="estudiante?accion=descargarConstancia&idEstudiante=${matriculaLists.getIdEstudiante()}"><img src="assets/img/descargar.png" style="width: 25px;"></a>
													<a href="./assets/docs/DOCUMENTOS.pdf"> <img src="assets/img/archivo-pdf.png" style="width: 25px;" download style="text-decoration:none"></a>
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