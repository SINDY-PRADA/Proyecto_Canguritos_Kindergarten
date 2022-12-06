<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="model.Operaciones" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="assets/fonts/icomoon/style-icono.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/css/Estilos/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="assets/css/Estilos/style-1.css">

    <!-- Favicons -->
    <link href="assets/img/canguro.png" rel="icon">

    <title>Canguritos Kindergarten</title>
  </head>
  <body>

  <div class="d-md-flex half">
    <div class="bg" style="background-image: url('assets/img/niño.jpg');"></div>
    <div class="contents">

      <div class="container">
        <div class="row align-items-center justify-content-center">
          <div class="col-md-12">
            <div class="form-block mx-auto">
              <div class="text-center mb-5">
              <h3><strong>Iniciar Sesión</strong></h3>
              <!-- <p class="mb-4">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p> -->
              </div>
              <form action="login" method="POST">
                <div class="form-group first">
                  <label for="txtUsuario">Usuario</label>
                  <input type="text" class="form-control" placeholder="Tú-email@gmail.com" name="txtUsuario">
                </div>
                <div class="form-group last mb-3">
                  <label for="txtContra">Contraseña</label>
                  <input type="password" class="form-control" placeholder="Tú Conraseña" name="txtContra">
                </div>
                <br>
               <input type="submit" name="btnIngresar" value="Ingresar" class="btn btn-block btn-primary">
              </form>
             
           </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  </body>
</html>