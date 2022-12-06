<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Canguritos Kindergarten</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="assets/css/main.css">

	  <!-- Favicons -->
	  <link href="assets/img/canguro.png" rel="icon">
	  <link href="assets/css/sweetalert2.css" rel="stylesheet">
	  <link href="assets/css/sweetalert.css" rel="stylesheet">
	  
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
	  url:"acudiente?accion=editarAcudiente&idAcudiente="+id,
	  success: function(res){
		console.log(res);
	  }
	});
	swal("Se esta redireccionando...", {
	icon: "success",
	}).then((OK)=>{
			if(OK){
				location.href="acudiente?accion=editarAcudiente&idAcudiente="+id
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

<script>
	function Eliminar(id){
swal({
title: "¿Está seguro que desea eliminar?",
text: "El registro se eliminara",
icon: "warning",
buttons: true,
dangerMode: true,
})
.then((OK) => {
if (OK) {
$.ajax({
url:"acudiente?accion=eliminarAcudiente&idAcudiente="+id,
success: function(res){
	console.log(res);
}
});
swal("Eliminado exitosamente!", {
icon: "success",
}).then((OK)=>{
		if(OK){
			location.href="acudiente?accion=eliminarAcudiente&idAcudiente="+id
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
					<a href="#" class="btn-search">
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
						<li><a href="acudiente?accion=consultarAcudiente" style="text-decoration:none">Consultar</a></li>
						
					</ul>
					<div id="myTabContent" class="tab-content">
					  	<div class="tab-pane fade active in" id="acudiente?accion=consultarAcudiente">
							<div class="table-responsive">
								<table class="table table-hover text-center">
									<thead>
										<tr>
											<th class="text-center">No.Acudiente</th>
											<th class="text-center">Parentesco</th>
											<th class="text-center">Nombre</th>
											<th class="text-center">Apellido</th>
											<th class="text-center">Tipo Documento</th>
											<th class="text-center">Documento</th>
											<th class="text-center">Profesión</th>
											<th class="text-center">Teléfono</th>
											<th class="text-center">Direccion</th>
											<th class="text-center">Correo</th>
											<th class="text-center">Estado</th>
											<th class="text-center">Cambiar Estado</th>
											<th class="text-center">Acción</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="acudienteList" items="${listar}">
										<tr>
											<td>${acudienteList.getIdAcudiente()}</td>
											<td>${acudienteList.getParentescoAcudiente()}</td>
											<td>${acudienteList.getNombreAcudiente()}</td>
											<td>${acudienteList.getApellidoAcudiente()}</td>
											<td>${acudienteList.getTipoDocumento()}</td>
											<td>${acudienteList.getDocumentoAcudiente()}</td>
											<td>${acudienteList.getProfesionAcudiente()}</td>
											<td>${acudienteList.getTelefonoAcudiente()}</td>
											<td>${acudienteList.getDireccionAcudiente()}</td>
											<td>${acudienteList.getCorreoAcudiente()}</td>
										<td>
											<c:if test="${acudienteList.getEstadoAcudiente() == true}">
												<span>Activo</span>
												</c:if>
												<c:if test="${acudienteList.getEstadoAcudiente() == false}">
												<span>Inactivo</span>
												</c:if>
											</td>
										<td>
											<c:if test="${acudienteList.getEstadoAcudiente() == false}">
												<a href="acudiente?accion=estado&idAcudiente=${acudienteList.getIdAcudiente()}&estadoAcudiente=true" class="activar" style="text-decoration:none"><span>Activar</span></a>
												</c:if>
												<c:if test="${acudienteList.getEstadoAcudiente() == true}">
												<a href="acudiente?accion=estado&idAcudiente=${acudienteList.getIdAcudiente()}&estadoAcudiente=false"  class="inactivar" style="text-decoration:none"><span>Inactivar</span></a>
												</c:if>
											 </td>
											 <td>
												<div>
													<!-- <a href="acudiente?accion=editarAcudiente&idAcudiente=${acudienteList.getIdAcudiente()}"><img src="assets/img/Editar.png" style="width: 25px;" onclick="return ConfirmDatos()"></a>-->
													<a onclick="Editar([[${acudienteList.getIdAcudiente()}]])">
                                                        <img src="assets/img/Editar.png" style="width: 25px;"></a>
													
													<!-- <a href="acudiente?accion=eliminarAcudiente&idAcudiente=${acudienteList.getIdAcudiente()}"><img src="assets/img/eliminar.png" style="width: 25px;" onclick="return ConfirmEliminar()"></a>  -->
													<a onclick="Eliminar([[${acudienteList.getIdAcudiente()}]])">
														<img src="assets/img/eliminar.png" style="width: 25px;"></a>
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


















