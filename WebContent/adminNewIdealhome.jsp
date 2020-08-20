<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Ideal Home</title>
	<script>
		function validation(event){
			
			var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
			var emailValid = document.forms["new"]["email"].value;
			
			var contact = document.forms["new"]["phonenumber"].value;
			
			if(reg.test(emailValid) == false){
				alert('Invalid Email address. Format should be ex: someone@example.com');
				return false;
			}
			
			if(contact.length !=10){
				alert('Invalid contact Number. Your contact No. should have 10 digits.');
				return false;
			}
			
			return true;
		}
	</script>
	<link href="newIdealHome.css" rel="stylesheet" />
	<link href="css/idealhomeform.css" rel="stylesheet" />
	<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/newIdealHome.css">
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/idealhomeform.css">
	
</head>
<body>
<style> <%@ include file="css/newIdealHome.css"%></style>

<div class="header">
 <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">Master of Property</a><button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto my-2 my-lg-0">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="index.jsp">Home</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="idealHome.jsp">Ideal Home</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#contact">Contact Us</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="adminLogin.jsp">Admin Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
</div>
<br><br>	

<center>
<p>New AD for Ideal Home<p>
<div class="card">
	<form id="info-form" name="new" action="adminInsertIdealHome" method="post" onSubmit="return validation(event)">
		<div>
			<label><span>Title:</span>
			<input type="text" name="title" required placeholder="Title of the AD">
			</label>
		</div>
		<div>
			<label><span>Description:</span>
			<textarea name="description" placeholder="Briefly explain what you're doing"></textarea>
			</label>
		</div>
		<div>
			<label><span>Contact Name:</span>
			<input type="text" name="name" required placeholder="Contact Name">
			</label>
		</div>
		<div>
			<label><span>Contact e-mail</span>
			<input type="text" name="email" required placeholder="Contact e-mail (someone@example.com)">
			</label>
		</div>		
			<label><span>Contact Phone Number:</span>
			<input type="text" name="phonenumber" required placeholder="+94 1234567890">
			</label>
		</div>	
		<input type="hidden" name="uID" value="<%=session.getAttribute("userID") %>" />
		<br><br>		
		<div>
			<button name="submit" type="submit">Submit</button>
		</div>
		
	</form>
</div>
</center>
<br>
<hr>
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