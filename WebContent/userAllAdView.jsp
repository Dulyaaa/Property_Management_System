<%@page import="com.masterofproperty.model.*" %>
<%@page import="com.masterofproperty.idealhome.services.*" %>
<%@page import="com.masterofproperty.apartment.services.*" %>
<%@page import="com.masterofproperty.userOperation.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User Posted Ads</title>
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/newIdealHome.css">
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/idealhomeform.css">
	<link href="css/newIdealHome.css" rel="stylesheet" />
	<link href="css/idealhomeform.css" rel="stylesheet" />
</head>
<body>
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
	<div class="upperBar">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Logged in as: <%=session.getAttribute("firstname") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<%=session.getAttribute("user") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="gotoAccounr">My Account</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="logout">Log Out</a>
	</div>
<hr>
<center>
<h2>Here are all you created ADs..</h2>
<br>
<span style="color:red"><%=(request.getAttribute("message") == null) ? "" : request.getAttribute("message")%></span>
<br>
<%
	int id = (int) session.getAttribute("userID");
%>
<div>
<fieldset>
	<legend>Houses</legend>
	<table border="1">
	<tr>
		<th>Name</th>
		<th>Price</th>
		<th>Address</th>
		<th>Perches</th>
		<th>NoOfBedRooms</th>
		<th>Description</th>
		<th>Action</th>
		
	</tr>
	
	<%
		//int id = session.getAttribute("userID");
		userAccountDAO ihouse = new userAccountDAO();
		List<House> Listhouse = ihouse.displayhouse(id);
		
		for(House house : Listhouse){
	%>
	<tr>
		<td><%= house.getName() %></td>
		<td><%= house.getPrice() %></td>
		<td><%= house.getAddress() %></td>
		<td><%= house.getPerches() %></td>
		<td><%= house.getNoOfBedRooms() %></td>
		<td><%= house.getDescription() %></td>
		<td>
			<form method="POST" action="deleteUserADhouse">
				<input type="hidden" name="sID" value="<%=house.getId()%>" /> 
				<input type="submit" value="Delete" />
			</form>
		</td>

	</tr>
		
	<%	
		}
    %> 
	<br></table >
	<br>
</fieldset>
<br>
<fieldset>
	<legend>Apartments</legend>
		<table border="1">
	<tr>
		<th>Name</th>
		<th>Price</th>
		<th>Address</th>
		<th>City</th>
		<th>Floor Area</th>
		<th>No of Bedrooms</th>
		<th>Description</th>
		<th>Action</th>
	</tr>
	
	
		<%
		userAccountDAO iapartment = new userAccountDAO();
		List<ModelApartment> Listapartment = iapartment.displayApartment(id);
		
		for(ModelApartment apartment : Listapartment){
	%>
	<tr>
		<td><%= apartment.getname() %></td>
		<td><%= apartment.getprice() %></td>
		<td><%= apartment.getaddress() %></td>
		<td><%= apartment.getcity() %></td>
		<td><%= apartment.getfloorArea() %></td>
		<td><%= apartment.getNoOfBedRooms()%></td>
		<td><%= apartment.getdescription() %></td>
		<td>
			<form method="POST" action="deleteUserADapartment">
				<input type="hidden" name="sID" value="<%=apartment.getid()%>" /> 
				<input type="submit" value="Delete" />
			</form>
		</td>

	</tr>
		
	<%	
		}
    %> 
	<br></table><br>
</fieldset>
<br>
<fieldset>
	<legend>Lands</legend>
		<table border="1">
	<tr>
		<th>IdealHomeId</th>
		<th>Title</th>
		<th>Description</th>
		<th>Contact Name</th>
		<th>Contact Email</th>
		<th>Contact Phone number</th>
		<th>Action</th>
	</tr>
	<%
		IIdealHome ilands = new IdealHomeDAO();
		List<IdealHome> Listland = ilands.displayIdealHomeWithID();
		
		for(IdealHome idealHome : Listland){
	%>
	<tr>
		<td><%= idealHome.getsID() %></td>
		<td><%= idealHome.getTitle() %></td>
		<td><%= idealHome.getDescription() %></td>
		<td><%= idealHome.getName() %></td>
		<td><%= idealHome.getEmail() %></td>
		<td><%= idealHome.getPnumber() %></td>
		<td>
			<form method="POST" action="../deleteIdealHomeController">
				<input type="hidden" name="sID" value="<%= idealHome.getsID()%>" /> 
				<input type="submit" value="Delete" />
			</form>
		</td>

	</tr>
		
	<%	
		}
    %> 
	<br></table><br>
</fieldset>
<br>
<fieldset>
	<legend>Ideal Home</legend>
		<table border="1">
	<tr>
		<th>Title</th>
		<th>Description</th>
		<th>Contact Name</th>
		<th>Contact Email</th>
		<th>Contact Phone number</th>
		<th>Action</th>
	</tr>
	

	<%
		//int id = session.getAttribute("userID");
		userAccountDAO iidealhome = new userAccountDAO();
		List<IdealHome> Listidealhome = iidealhome.displayIdealHome(id);
		
		for(IdealHome idealHome : Listidealhome){
	%>
	
	<tr>
		<td><%= idealHome.getTitle() %></td>
		<td><%= idealHome.getDescription() %></td>
		<td><%= idealHome.getName() %></td>
		<td><%= idealHome.getEmail() %></td>
		<td><%= idealHome.getPnumber() %></td>
		<td>
			<form method="POST" action="deleteUserAD">
				<input type="hidden" name="sID" value="<%=idealHome.getsID()%>" /> 
				<input type="submit" value="Delete" />
			</form>
		</td>

	</tr>
		
	<%	
		}
    %> 
	<br></table><br>
</fieldset>

</div>
</center>
<br><br><hr>
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