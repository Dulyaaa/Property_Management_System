<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us</title>

<style>

.img {
 position: relatives;
 text-align:center;
 color:white;
}

.centered {
 position: absolute;
 top: 25%;
 left: 50%;
 transform: translate(-50%,-50%);
 font-size:50px;
 font-weight:bold;
 
}
  
.main {
 text-align:left;
}
.ps a{
  display:inline-block;
margin: 0 30px;
width:150px;
height:150px;
overflow:hidden;
border-radius:50%;
}

.ps a img{
  width:100%;
  filter:grayscale(100%);
}


</style>

</head>
<body>

   <jsp:include page="header.jsp"></jsp:include>
<br><br>
<div class="img">
<img src="images/b1.jpg" alt="" style="width:1400px;height:200px;">
<div class="centered">About Us</div>
</div>
<div class="main">
<br>
<p class="text"><b>Master of Property</b> established in 2010, are located in Colombo SriLanka. We have the largest number of SriLankan property ads on the internet. Master of property was started with the intention of providing an online platform for property owners. 
Our website is open to anyone to submit their property for sale,property foe rent, land sales or any such service ads in SriLanka.Please note that we are not estate agents / brokers and all the ads on the site have been posted by the owner/agent of that property directly. You may advertise/rent/sell your property for free through Master of property.com <br>
Master of Property.com is owned and managed by Master of property (pvt)Ldt incorporated in Sri Lanka</p>
</div>

<fieldset>
<legend> 
<h2>Our Mission</h2>
</legend>
<p class="text">Master of property's mission is to become the best property management company and provide the best service to our client building on the foundation teamwork.Master of property maintains a reputation for quality and integrity.
</p>
</fieldset>

<fieldset>
<legend>
<h2>Our Vision</h2>
</legend>
<p class="text">We have the vision to take your investment property to the next level !</p>
</fieldset>


<fieldset>
<legend><h2>Our Team</h2></legend>
<p class="txt">We have a team of 10 members who have  received extensive training on business management, financial management ...etc, and count several years experience in the buying and selling industry that makes 'Master of Property' a property management company in SriLanka.</p>
<div class="ps">

  <a><img src="images/a91.jpg" alt=""></a>
  <a><img src="images/aa9.jpg" alt=""></a>
  <a><img src="images/a7.jpg" alt=""></a>
  <a><img src="images/a14.jpg" alt=""></a>
</div>
</fieldset>

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