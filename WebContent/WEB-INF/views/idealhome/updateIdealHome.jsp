<%@ page import="com.masterofproperty.model.IdealHome" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Ideal Home</title>
	<link href="newIdealHome.css" rel="stylesheet" />
	<link href="css/idealhomeform.css" rel="stylesheet" />
	<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/newIdealHome.css">
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/idealhomeform.css">
	
</head>
<body>
<style> <%@ include file="../../../css/newIdealHome.css"%></style>

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

</div>
<br><br>

<center>
<p>Update the Ideal Home<p>
<div class="card">

<%
	IdealHome idealhome = (IdealHome) request.getAttribute("idealhome");
%>

	<form id="info-form" method="post" action="updateIdealHome">
		<div>
			
			<label><span>Title:</span>
			<input type="text" value="<%=idealhome.getTitle() %>" name="title" >
			</label>
		</div>
		<div>
			<label><span>Description:</span>
			<textarea name="description" value="<%=idealhome.getDescription() %>" ></textarea>
			</label>
		</div>
		<div>
			<label><span>Contact Name:</span>
			<input type="text" name="name" value="<%=idealhome.getName() %>" >
			</label>
		</div>
		<div>
			<label><span>Contact e-mail</span>
			<input type="text" name="email" value="<%=idealhome.getEmail() %>" >
			</label>
		</div>		
			<label><span>Contact Phone Number:</span>
			<input type="text" name="phonenumber" value="<%=idealhome.getPnumber() %>" >
			</label>
			<br><br><br>
			<input type="hidden" name="sID" value="<%=idealhome.getsID()%>" /> 
			<button type="submit" value="Update">Update</button>
		</div>
	</form>
</div>
</center>
<br><br>
</body>
</html>