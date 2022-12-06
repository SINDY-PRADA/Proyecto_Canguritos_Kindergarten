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
					<a href="#" class="btn-search">
						<i class="zmdi zmdi-search"></i>
					</a>
				</li>
			</ul>
		</nav>
		<!-- Content page -->
		<div class="container-fluid">
			<div class="page-header">
			  <h1 class="text-titles"><i class="zmdi zmdi-account zmdi-hc-fw"></i> Usuario <small>Administrador</small></h1>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
						<li><a href="usuario?accion=añadirUsuario" style="text-decoration:none">Agregar</a></li>
						<li><a href="usuario?accion=editarUsuario" style="text-decoration:none">Editar</a></li>
						<li><a href="usuario?accion=consultarUsuario" style="text-decoration:none">Consultar</a></li>

					</ul>
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in">
							<div class="container-fluid">
								<div class="row">
									<div class="formulario__grupo-input">
									    <form action="usuario" method="POST" class="formulario" id="formulario">                      
                      <c:forEach var="usuario" items="${usuarioLists}">
			
                        <div class="formulario__grupo" id="grupo__username">
                          <label for="username" class="formulario__label">Nombre</label>
                          <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input" name="nombreUsuario" id="nombreUsuario" value="${usuario.getUsername()}">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                          </div>
                          <p class="formulario__input-error">Debe ser de 4 a 16 dígitos y solo puede contener letras</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__pass">
                          <label for="pass" class="formulario__label">Contraseña</label>
                          <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input" name="contrasenaUsuario" id="contrasenaUsuario" value="${usuario.getPass()}">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                          </div>
                          <p class="formulario__input-error">La contraseña tiene que ser de 4 a 10 dígitos</p>
                        </div>

                        <div class="formulario__grupo" id="grupo__nivel">
                          <label for="nivel" class="formulario__label">Cargo</label>
                          <div class="formulario__grupo-input">
                            <input type="text" class="formulario__input"name="rol" id="rol" value="${usuario.getNivel()}">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                          </div>
                          <p class="formulario__input-error">Debe colocar "1" si es la Rectora o "2" si es Estudiante</p>
                        </div>
  
                        <div class="formulario__grupo">
                            <label class="formulario__label">Estado</label>
                            <div class="formulario__grupo-input">
                              <select name="estadoUsuario" id="estadoUsuario" class="formulario__input"> 
                              <c:if test="${usuario.getEstadoUsuario() == false}">
                                <option value="${usuario.getEstadoUsuario()}">Inactivo</option>
                                <option value="true">Activo</option>
                              </c:if>
                              <c:if test="${usuario.getEstadoUsuario() == true}">
                                <option value="${usuario.getEstadoUsuario()}">Activo</option>
                                <option value="false">Inactivo</option>
                              </c:if>
                              </select>
                            </div>
                        </div>
                          <div class="formulario__grupo formulario__grupo-btn-enviar">
                            <button class="btn btn-info btn-raised btn-sm" name="accion" value="actualizar" style="height: 40px;"><i class="zmdi zmdi-floppy"></i> EDITAR</button>
                          </div> 
                          </c:forEach>
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
    <script src="assets/js/validaciones/validarUsuario.js"></script>
    <script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
    <script>
      $.material.init();
    </script>
  </body>
  </html>
