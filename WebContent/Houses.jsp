<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Houses</title>
<style>
*{
	margin: 0px;
	padding:0px;
}
.main{
	
}
.cards{
	width:20%;
	display:inline-block;
	background-color:white;
	border-radius:5px;
	margin:40px;
	box-shadow:2px 2px 10px black;
}
.cards:hover{
	box-shadow:2px 2px 10px black;
}
.image img{
	width:100%;
	border-radius:5px;
}
.des{
	text-align:center;
	margin-bottom:30px;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br><br><br><br>
<h2>Here your dream house</h2>
<br><br>
<div class="main">
<div class="cards">
<div class="image">
<img src="images/house1.jpg">
</div>
<div class="des">
<h1>Luxury 3 Bedroom house for sale</h1>
<p>Most ideal locations and go to extraordinary lengths to secure the best lands in the best neighborhoods that offer both beauty and convenience.
	</p>
</div>
</div>
<div class="cards">
<div class="image">
<img src="images/house2.jpg">
</div>
<div class="des">
<h1>3 Bedroom luxurious house</h1>
<p>Most ideal locations and go to extraordinary lengths to secure the best lands in the best neighborhoods that offer both beauty and convenience.
	</p>
</div>
</div>
<div class="cards">
<div class="image">
<img src="images/house3.jpg">
</div>
<div class="des">
<h1>Two storied house in Gampaha</h1>
<p>Most ideal locations and go to extraordinary lengths to secure the best lands in the best neighborhoods that offer both beauty and convenience.
	</p>
</div>
</div>
<div class="cards">
<div class="image">
<img src="images/house4.jpg">
</div>
<div class="des">
<h1>Brand new two storied House</h1>
<p>Most ideal locations and go to extraordinary lengths to secure the best lands in the best neighborhoods that offer both beauty and convenience.
	</p>
</div>
</div>
<div class="cards">
<div class="image">
<img src="images/house5.jpg">
</div>
<div class="des">
<h1>Luxurious House in Kandy</h1>
<p>Most ideal locations and go to extraordinary lengths to secure the best lands in the best neighborhoods that offer both beauty and convenience.
	</p>
</div>
</div>
<div class="cards">
<div class="image">
<img src="images/house6.jpg">
</div>
<div class="des">
<h1>simple House in Matara</h1>
<p>Most ideal locations and go to extraordinary lengths to secure the best lands in the best neighborhoods that offer both beauty and convenience.
	</p>
</div>
</div>
</div>

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