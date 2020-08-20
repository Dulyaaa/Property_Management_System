<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Sign Up</title>
<style>
.header{
  max-width: 100%;
  margin: auto;
  text-align: center;
  padding: 30px;
  background: black;
}
	input[type=text] {
  border: 1px solid blue;
  border-radius: 2px;
}
	input[type=password] {
  border: 1px solid blue;
  border-radius: 2px;
}
.reg-box{
	border:2px blue;
	border-radius:2px;
	border-style: groove;
}
input[type=submit] {
  border: 3px solid blue;
  border-radius: 3px;
</style>
</head>
<body>
<div class="header">
<jsp:include page="header.jsp"></jsp:include>
</div>
<br><br><br><br>
<div class="reg-box">
<center>
<form action="cus_register" method="post">
<h4>To provide successful service, you have to be a member</h4>
<br><br>
<table>
<tr><td>
First name * :</td><td>
  <input type="text" placeholder="your firstname"  name="firstname" maxlength="20"></td></tr>
<tr><td><br>
Last name * :</td><td>
  <input type="text" placeholder="your lastname" name="lastname"></td></tr>
<tr><td><br>
Email *     :</td><td>
  <input type="text" placeholder="your email" name="email"></td></tr>
  <tr><td><br>
Country  :</td><td>
<select name="country">
  <option value="Select">Select</option>
  <option value="Australia">Australia</option>
  <option value="Canada">Canada</option>
  <option value="Finland">Europe</option>
  <option value="Austria">NewZealand</option>
  <option value="China">SriLanka</option>
  <option value="France">Other</option>
  </select>
<tr><td><br>
Create Password :</td><td>
  <input type="password" placeholder="Create Password" id="password" value="" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
</td>
<tr><td><br>
Confirm Password :</td><td>
  <input type="password" placeholder="Confirm Password" id="password1" value="" name="password"></td>
<tr><td><br>
  <input type="checkbox" id="myCheck">I agree to terms and conditions</td></tr>
</table><br>
  <input type="submit" value="Register Now">
</form>
<br><br>
<h3>Already a member?<a href="login.jsp">Log in</a></h3>
</center>
</div>
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