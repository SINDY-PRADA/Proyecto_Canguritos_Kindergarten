<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Canguritos Kindergarten - Index</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  
  <!-- Favicons -->
  <link href="assets/img/canguro.png" rel="icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">
  <link href="assets/css/style-2.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Restaurantly - v3.1.0
  * Template URL: https://bootstrapmade.com/restaurantly-restaurant-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>
<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-cente">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-lg-between">

      <h1 class="logo me-auto me-lg-0"><a href="inicio.jsp">JARDÍN CANGURITOS KINDERGARTEN</a></h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.html" class="logo me-auto me-lg-0"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="nav-link scrollto active" href="index.jsp">Inicio</a></li>
          <li class="dropdown"><a href="#"><span>Matrícula</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="matricula?accion=añadirMatricula">Agregar</a></li>
              <li><a href="matricula?accion=editarMatricula">Editar</a></li>
              <li><a href="matricula?accion=consultarMatricula">Consultar</a></li>
            </ul>
              <li class="dropdown"><a href="#"><span>Estudiante</span> <i class="bi bi-chevron-down"></i></a>
                <ul>
                  <li><a href="estudiante?accion=añadirEstudiante">Agregar</a></li>
                  <li><a href="estudiante?accion=editarEstudiante">Editar</a></li>
                  <li><a href="estudiante?accion=consultarEstudiante">Consultar</a></li>
                </ul>
              </li>
            <li class="dropdown"><a href="#"><span>Año lectivo</span> <i class="bi bi-chevron-down"></i></a>
              <ul>
                <li><a href="anolectivo?accion=añadirAnolectivo">Agregar</a></li>
                <li><a href="anolectivo?accion=editarAnolectivo">Editar</a></li>
                <li><a href="anolectivo?accion=consultarAnolectivo">Consultar</a></li>
              </ul>
            </li>
            <li class="dropdown"><a href="#"><span>Acudiente</span> <i class="bi bi-chevron-down"></i></a>
              <ul>
                <li><a href="acudiente?accion=añadirAcudiente">Agregar</a></li>
                <li><a href="acudiente?accion=editarAcudiente">Editar</a></li>
                <li><a href="acudiente?accion=consultarAcudiente">Consultar</a></li>
              </ul>
            </li>
          <li class="dropdown"><a href="#"><span>Rol</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="rol?accion=añadirRol">Agregar</a></li>
              <li><a href="rol?accion=editarRol">Editar</a></li>
              <li><a href="rol?accion=consultarRol">Consultar</a></li>
            </ul>
          </li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->
      <a href="login.jsp" class="book-a-table-btn scrollto d-none d-lg-flex">Cerrar Sesión</a>
    </div>
  </header><!-- End Header -->
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
   <!-- menu-container -->
      <section class="form-login">
      <h5><b>AGREGAR AÑO LECTIVO</b></h5>
      <c:forEach var="anolectivo" items="${anolectivoLists}">
         <form  action="anolectivo" method="POST">
         <input type="number" class="controls" placeholder="Año inicio" name="anoInicio" id="anoInicio" value="${anolectivo.getAnoInicio()}">
         <input type="number" class="controls" placeholder="Año fin" name="anoFin" id="anoFin" value="${anolectivo.getAnoFin()}">
         <input type="number" class="controls" placeholder="Valor matricula" name="valorMatricula" id="valorMatricula" value="${anolectivo.getValorMatricula()}">
         <input type="number" class="controls" placeholder="Valor pension" name="valorPension" id="valorPension" value="${anolectivo.getValorPension()}">
      
      <select name="estadoAnolectivo" id="estadoAnolectivo"  class="controls" disabled="disabled"> 
      <c:if test="${anolectivo.getEstadoAnolectivo() == false}">
         <option value="${anolectivo.getEstadoAnolectivo()}">Inactivo</option>
         <option value="true">Activo</option>
      </c:if>
      <c:if test="${anolectivo.getEstadoAnolectivo() == true}">
         <option value="${anolectivo.getEstadoAnolectivo()}">Activo</option>
         <option value="false">Inactivo</option>
      </c:if>
      </select>
         <button class="buttons" value="actualizar" name="accion">Editar</button>
      </form>
      </c:forEach>
      </section>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
      <!-- ======= Footer ======= -->
      <footer id="footer">
         <div class="container">
            <div class="copyright">
            &copy; Derechos reservados <strong><span>Canguritos Kindergarten 2022</span></strong>
            </div>
         </div>
      </footer><!-- End Footer -->

      <div id="preloader"></div>
      <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

      <!-- Vendor JS Files -->
      <script src="assets/vendor/aos/aos.js"></script>
      <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
      <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
      <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
      <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

      <!-- Template Main JS File -->
      <script src="assets/js/main.js"></script>
   </body>
</html>

