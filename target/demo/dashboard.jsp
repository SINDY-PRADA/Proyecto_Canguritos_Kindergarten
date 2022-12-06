<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page session="true" %>
<%@include file="Sesion/sesion.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Canguritos Kindergarten</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="assets/css/main.css">

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
							<i class="zmdi zmdi-power" action="sesion" method="POST"></i>
						</a>
					</li>
				</ul>
			</div>
			<!-- SideBar Menu -->
			<ul class="list-unstyled full-box dashboard-sideBar-Menu">
				<li>
					<a href="#">
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
					<a href="./assets/docs/MANUAL_USUARIO_CANGURITOSKINDERGARTEN.pdf" download style="text-decoration:none"> Manual </a>
				</a>
			</li>
		</ul>
	</nav>
		<!-- Content page -->
		<div class="container-fluid">
			<div class="page-header">
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> BIENVENIDA RECTORA</h1>
			</div>
		</div>
			<div class="container-fluid">
				<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Eligendi odio, 
				animi ratione quos asperiores aliquam veniam dolorum dolorem itaque reprehenderit 
				atque neque sint dignissimos natus, ipsa labore qui porro nobis.</p>
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
	<script>
		$.material.init();
	</script>
</body>
</html>