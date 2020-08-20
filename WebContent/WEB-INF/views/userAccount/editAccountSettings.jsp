<%@ page import="com.masterofproperty.user.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User Details</title>
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>../../../css/newIdealHome.css">
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>../../../css/idealhomeform.css">
<style>
.header{
  max-width: 100%;
  margin: auto;
  text-align: center;
  padding: 25px;
  background: black;
}
</style>
</head>
<body>
	<link href="../../../css/newIdealHome.css" rel="stylesheet" />
	<link href="../../../css/idealhomeform.css" rel="stylesheet" />
<div class="header">
<jsp:include page="../../../header.jsp"></jsp:include>
</div>
<br><br>
<div>

	<%
		user user = (user) request.getAttribute("user");
	%>
<br><br>	
<form id="info-form" method="post" action="updateUserDetails">

<table align="center">
	<tr>
		<td>First Name</td>
		<td><input type="text" value="<%=user.getFirstname() %>" name="firstname" ></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" value="<%=user.getLastname() %>" name="lastname" ></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" value="<%=user.getEmail() %>" name="email" ></td>
	</tr>
	<tr>
		<td>Country</td>
		<td><input type="text" value="<%=user.getCountry() %>" name="country" ></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="text" value="<%=user.getPassword() %>" name="password" ></td>
	</tr>
	<tr></tr>
	<tr>
	<td></td>
		<input type="hidden" name="uID" value="<%=session.getAttribute("userID") %>" /> 
		<td><button type="submit" value="Update">Update</button></td>
		<td></td>
	</tr>
</table>
<br>

		
</form>
</div>
<br><br>
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
        <script src="../../../js/scripts.js"></script>
</body>
</html>