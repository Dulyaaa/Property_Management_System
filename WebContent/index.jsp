<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Property Management System</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.13.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
        <!-- Third party plugin CSS-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/style5.css">
        <link href="css/styles5.css" rel="stylesheet" />
    </head>
    <body id="page-top">
    
    <jsp:include page="header.jsp"></jsp:include>
        <!-- Navigation-->
<!--         <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav"> -->
<!--             <div class="container"> -->
<!--                 <a class="navbar-brand js-scroll-trigger" href="#page-top">Master of Property</a><button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button> -->
<!--                 <div class="collapse navbar-collapse" id="navbarResponsive"> -->
<!--                     <ul class="navbar-nav ml-auto my-2 my-lg-0"> -->
<!--                         <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#about">Home</a></li> -->
<!--                         <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#services">Our Service</a></li> -->
                        
<!--                         <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#contact">Contact Us</a></li> -->
<!--                     </ul> -->
<!--                 </div> -->
<!--             </div> -->
<!--         </nav> -->

        <!-- Masthead-->
        <header class="masthead">    
            <div class="container h-100">
                <div class="row h-100 align-items-center justify-content-center text-center">
                    <div class="col-lg-10 align-self-end">
                        <h1 class="text-uppercase text-white font-weight-bold">Make Your Property Dream Come True</h1>
                        <hr class="divider my-4" />
                    </div>
                    <div class="col-lg-8 align-self-baseline">
                        <p class="text-white-75 font-weight-light mb-5">Choose from 10000+ properties on Sri Lanka's largest Property Website</p>
                        <a class="btn btn-primary btn-xl js-scroll-trigger" style="margin:50px;"href="login.jsp">Log In</a>
                        <a class="btn btn-primary btn-xl js-scroll-trigger" style="margin:50px;"href="signup.jsp">Sign Up</a>
                    </div>
                </div>
            </div>
        </header>
        <!-- About-->
        <section class="page-section bg-success" id="about">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-8 text-center">
                        <h2 class="text-white mt-0">Showcase Properties</h2>
                        <hr class="divider light my-4" />
                         <div class="form-row">
                        
                        <a class="btn btn-light btn-xl js-scroll-trigger" style="margin:50px;" href="Houses.jsp">Houses</a>
                        <a class="btn btn-light btn-xl js-scroll-trigger" style="margin:50px;" href="Apartment.jsp">Apartments</a>
                        <a class="btn btn-light btn-xl js-scroll-trigger" style="margin:50px;" href="land.jsp">Lands</a>
                       
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Services-->
        <section class="page-section" id="services">
            <div class="container">
                <h2 class="text-center mt-0">Our Properties</h2>
                <hr class="divider my-4" />
                <div class="row">
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="mt-5">
                            <i class="fas fa-4x fa-gem text-primary mb-4"></i>
                            <h3 class="h4 mb-2">Security guaranteed properties</h3>
                           
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="mt-5">
                            <i class="fas fa-4x fa-laptop-code text-primary mb-4"></i>
                            <h3 class="h4 mb-2">Search your properties any time</h3>
                            
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="mt-5">
                            <i class="fas fa-4x fa-globe text-primary mb-4"></i>
                            <h3 class="h4 mb-2">Easily find your property from anywhere in the world</h3>
                            
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 text-center">
                        <div class="mt-5">
                            <i class="fas fa-4x fa-heart text-primary mb-4"></i>
                            <h3 class="h4 mb-2">Properties with beautiful surroundings</h3>
                           
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Portfolio-->
       
        <!-- Call to action-->
        
        <!-- Contact-->
        <section class="page-section" id="contact">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-8 text-center">
                        <h2 class="mt-0">To Contact Us</h2>
                        <hr class="divider my-4" />
                        <p class="text-muted mb-5"></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 ml-auto text-center mb-5 mb-lg-0">
                        <i class="fas fa-phone fa-3x mb-3 text-muted"></i>
                        <div>07XXXXXXXX</div>
                    </div>
                    <div class="col-lg-4 mr-auto text-center">
                        <i class="fas fa-envelope fa-3x mb-3 text-muted"></i
                        ><!-- Make sure to change the email address in BOTH the anchor text and the link target below!--><a class="d-block" href="">MasterOfProperty@gmail.com</a>
                    </div>
                    
                </div>
            </div>
        </section>
        <!-- Footer-->
        
        <footer class="bg-light py-5">
            <div class="container"><div class="small text-center text-muted">Copyright © 2020</div></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
