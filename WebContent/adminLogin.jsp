<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>

<style>


form{
   border: 3px solid black;
   margin-left:15%;
   margin-right:15%;
}
 
 .header{
  max-width: 100%;
  margin: auto;
  text-align: center;
  padding: 30px;
  background: black;
}

.login {
  padding: 16px;
}
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
.imgcontainer {
  text-align: center;
  margin: 12px 0 12px 0;
  position: relative;
}

span.psw {
  float: right;
  padding-top: 16px;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

</style>


<title>Admin Login</title>
</head>
<body>

<div class="header">
<jsp:include page="header.jsp"></jsp:include>
</div>
<br><br><br>
<form method="post" action="AdminServlet">


 <div class="imgcontainer">
      
      <h1>Admin Login</h1>
      <img src="images/avatar6.jpg" alt="stylesheet">
    </div>

<div class="login">
 <label for="uname"><b>Username</b></label>
 <input type="text" placeholder="Enter username" name="username" required>
  <br>
  
  <label for="psw"><b>Pasword</b></label>
 <input type="password" placeholder="Enter password" name="password" required>
  <br>
  
  <button type="submit">Log In</button>
  <a href="login.jsp">User Login</a> 
 
 </div>
 
      
</form>

<script>

function checkAdLog(form){
	
	var errors=[];
	if(form.uname.value=="")
		{
		errors.push("Please input your name");
		}
	if(form.psw.val=="")
		{
		errors.push("Please enter your password")
		}
	if(errors.length>0){
		var msg = "ERRORS:\n\n;"
		for(var i=0;i<errors,length;i++){
			msg+=errors[i]+"\n";
		}
		alert(msg);
		return false;
	}
}

</script>
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