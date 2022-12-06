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

      <h1 class="logo me-auto me-lg-0"><a href="index.jsp">JARDÍN CANGURITOS KINDERGARTEN</a></h1>
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

   <!-- menu-container -->
      <section class="form-login">
      <h5><b>AÑO LECTIVO</b></h5>
        <form  action="anolectivo" onsubmit="return validarAñoLectivo();" method="POST">
          <label for="anoInicio">Año de Inicio</label>
         <input type="number" class="controls" placeholder="2022" name="anoInicio" id="anoInicio">
         <label for="anoFin">Año final</label>
         <input type="number" class="controls" placeholder="2022" name="anoFin" id="anoFin">
         <label for="valorMatricula">Valor de la matrícula</label>
         <input type="number" class="controls" placeholder="30.000" name="valorMatricula" id="valorMatricula">
         <label for="valorPension">Valor de la pensión</label>
         <input type="number" class="controls" placeholder="50.000" name="valorPension" id="valorPension">
         <label for="estado">estado</label>
         <select class="controls" disabled="disabled">
          <option value="false">Inactivo</option>
          <option value="true">Activo</option
      </select>
      <br>
      </select>
         <button type="submit" class="buttons" name="accion" value="add">Agregar</button>
      </form>
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
  <script src="assets/js/alertas.js"></script>
  <script src="assets/js/validarAnoLectivo.js"></script>
   </body>
</html>