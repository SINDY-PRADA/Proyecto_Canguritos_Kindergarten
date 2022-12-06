<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Canguritos Kindergarten</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/canguro.png" rel="icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
  <script src="https://unpkg.com/vue@2.6.10/dist/vue.min.js"></script>
  <script src="https://unpkg.com/vee-validate@latest"></script>
  
  <!-- Vendor CSS Files -->
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/Estilos/style.css" rel="stylesheet">

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
          <li><a class="nav-link scrollto active" href="#hero">Inicio</a></li>
          <li><a class="nav-link scrollto" href="#about">Nosotros</a></li>
          <li><a class="nav-link scrollto" href="#testimonials">Reseñas</a></li>
          <li><a class="nav-link scrollto" href="#gallery">Galería</a></li>
          <li><a class="nav-link scrollto" href="#contact">Contactanos</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->
      <a href="login.jsp" class="book-a-table-btn scrollto d-none d-lg-flex">Iniciar Sesión</a>

    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="d-flex align-items-center">
    <div class="container position-relative text-center text-lg-start" data-aos="zoom-in" data-aos-delay="100">
      <div class="row">
        <div class="col-lg-8">
          <h1><span>Agencia de niñeras</span></h1>
          <h2>Cuida y acompaña a tus hijos!</h2>

        </div>
        <div class="col-lg-4 d-flex align-items-center justify-content-center position-relative" data-aos="zoom-in" data-aos-delay="200">
          <a href="https://youtu.be/8dfCbSmpzho" class="glightbox play-btn"></a>
        </div>

      </div>
    </div>
  </section><!-- End Hero -->

  <main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container" data-aos="fade-up">

        <div class="row">
          <div class="col-lg-6 order-1 order-lg-2" data-aos="zoom-in" data-aos-delay="100">
            <div class="about-img">
              <img src="assets/img/nosotros.jpg" alt="">
            </div>
          </div>
          <div class="col-lg-6 pt-4 pt-lg-0 order-2 order-lg-1 content">
            <p>
              <h3>Somos una agencia de servicios de educación y cuidado que ofrece servicios de docentes y asistentes infantiles a domicilio, 
              de manera personalizada, confiable y segura, apuntando siempre al logro de un adecuado desarrollo infantil.</h3>
            </p>

            <p>
              <h3>Kanguritos ofrecemos servicios en modalidad horas, días, semanas, fines de semana y mensualidades, 
              para lo cual contamos con un equipo altamente calificado y en continua capacitación.</h3>
            </p>
          </div>
        </div>
      </div>
    </section><!-- End About Section -->

    <!-- ======= Testimonials Section ======= -->
    <section id="testimonials" class="testimonials section-bg">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <p>Lo que dicen nuestras familias</p>
        </div>

        <div class="testimonials-slider swiper-container" data-aos="fade-up" data-aos-delay="100">
          <div class="swiper-wrapper">

            <div class="swiper-slide">
              <div class="testimonial-item">
                <p id="familia-1">
                  <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                  Proin iaculis purus consequat sem cure digni ssim donec porttitora entum suscipit rhoncus. Accusantium quam, ultricies eget id, aliquam eget nibh et. Maecen aliquam, risus at semper.
                  <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                </p>
                <img src="assets/img/testimonios/testimonio-1.jpg" class="testimonial-img" alt="">
                <h3>Familia Ordóñez</h3>
              </div>
            </div><!-- End testimonial item -->

            <div class="swiper-slide">
              <div class="testimonial-item">
                <p id="familia-2">
                  <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                  Export tempor illum tamen malis malis eram quae irure esse labore quem cillum quid cillum eram malis quorum velit fore eram velit sunt aliqua noster fugiat irure amet legam anim culpa.
                  <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                </p>
                <img src="assets/img/testimonios/testimonio-2.jpg" class="testimonial-img" alt="">
                <h3>Familia López</h3>
              </div>
            </div><!-- End testimonial item -->

            <div class="swiper-slide">
              <div class="testimonial-item">
                <p id="familia-3">
                  <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                  Enim nisi quem export duis labore cillum quae magna enim sint quorum nulla quem veniam duis minim tempor labore quem eram duis noster aute amet eram fore quis sint minim.
                  <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                </p>
                <img src="assets/img/testimonios/testimonio-3.jpg" class="testimonial-img" alt="">
                <h3>Familia Rojas</h3>
              </div>
            </div><!-- End testimonial item -->
            <div class="swiper-slide">
              <div class="testimonial-item">
                <p id="familia-4">
                  <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                  Fugiat enim eram quae cillum dolore dolor amet nulla culpa multos export minim fugiat minim velit minim dolor enim duis veniam ipsum anim magna sunt elit fore quem dolore labore illum veniam.
                  <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                </p>
                <img src="assets/img/testimonios/testimonio-4.jpg" class="testimonial-img" alt="">
                <h3>Familia Alvarado</h3>
              </div>
            </div><!-- End testimonial item -->

            <div class="swiper-slide">
              <div class="testimonial-item">
                <p id="familia-5">
                  <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                  Quis quorum aliqua sint quem legam fore sunt eram irure aliqua veniam tempor noster veniam enim culpa labore duis sunt culpa nulla illum cillum fugiat legam esse veniam culpa fore nisi cillum quid.
                  <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                </p>
                <img src="assets/img/testimonios/testimonio-5.jpg" class="testimonial-img" alt="">
                <h3>Familia Cortez</h3>
              </div>
            </div><!-- End testimonial item -->

          </div>
          <div class="swiper-pagination"></div>
        </div>

      </div>
    </section><!-- End Testimonials Section -->

    <!-- ======= Gallery Section ======= -->
    <section id="gallery" class="gallery">

      <div class="container" data-aos="fade-up">
        <div class="section-title">
          <p>Algunas fotos de Nuestro Jardín</p>
        </div>
      </div>

      <div class="container-fluid" data-aos="fade-up" data-aos-delay="100">

        <div class="row g-0">

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-1.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-1.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-2.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-2.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-3.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-3.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-4.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-4.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-5.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-5.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-6.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-6.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-7.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-7.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="assets/img/galeria/galeria-8.jpg" class="gallery-lightbox" data-gall="gallery-item">
                <img src="assets/img/galeria/galeria-8.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>
        </div>
      </div>
    </section><!-- End Gallery Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <p>Contactanos</p>
        </div>
      </div>

      <div data-aos="fade-up">
        <iframe style="border:0; width: 100%; height: 550px;" src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15904.624485779981!2d-74.0884053!3d4.7429154!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x4ab1fff160bf8076!2sCanguritos%20Kindergarten!5e0!3m2!1ses!2sco!4v1662697752539!5m2!1ses!2sco" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade" frameborder="0" allowfullscreen></iframe>
      </div>

      <div class="container" data-aos="fade-up">

        <div class="row mt-5">

          <div class="col-lg-4">
            <div class="info">
              <div class="address">
                <i class="bi bi-geo-alt" id="ubicacion"></i>
                <h4>Ubicación:</h4>
                <p>Cra. 97 #146d-04, Bogotá, Cundinamarca</p>
              </div>

              <div class="open-hours">
                <i class="bi bi-clock" id="horario"></i>
                <h4>Horarios de apertura:</h4>
                <p>
                  Lunes Viernes:<br>
                  7:00 AM - 3:00 PM
                </p>
              </div>

              <div class="email">
                <i class="bi bi-envelope" id="correo"></i>
                <h4>Correo electrónico:</h4>
                <p>canguritoskindergarten@gmail.com</p>
              </div>

              <div class="phone">
                <i class="bi bi-phone" id="telefono"></i>
                <h4>Teléfono:</h4>
                <p>+57 3165370586</p>
              </div>
            </div>
          </div>
          <div class="col-lg-8 mt-5 mt-lg-0">
            <form action="forms/contact.php" method="post" role="form" class="php-email-form">
              <div class="row">
                <div class="col-md-6 form-group">
                  <input type="text" name="name" class="form-control" id="name" placeholder="Tu Nombre" required>
                </div>
                <div class="col-md-6 form-group mt-3 mt-md-0">
                  <input type="email" class="form-control" name="email" id="email" placeholder="Tu Correo Electrónico" required>
                </div>
              </div>
              <div class="form-group mt-3">
                <input type="text" class="form-control" name="subject" id="subject" placeholder="Tu Número Telefónico" required>
              </div>
              <div class="form-group mt-3">
                <textarea class="form-control" name="message" rows="8" placeholder="Escribe tu Mensaje" required></textarea>
              </div>
              <div class="my-3">
                <div class="loading">Cargando</div>
                <div class="error-message"></div>
                <div class="sent-message">Tu mensaje ha sido enviado. ¡Gracias!</div>
              </div>
              <div class="text-center"><button type="submit">Enviar mensaje</button></div>  
            </form>
          </div>
        </div>
      </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

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
  <script src="assets/js/validaciones/main.js"></script>

</body>

</html>