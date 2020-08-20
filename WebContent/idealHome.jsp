<%@page import="com.masterofproperty.model.IdealHome" %>
<%@page import="com.masterofproperty.idealhome.services.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ideal Home</title>
<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>css/allIdealHome.css">
</head>
<body>
<body>
<div class="header">
<jsp:include page="header.jsp"></jsp:include>
</div>
<br><br><br>
<style> <%@ include file="css/allIdealHome.css"%></style>
<center>
<h1 class="heading">Ideal Home</h1>
<h2>Make your dream property consummate </h2>
<h3>Here.. are a few features that make a perfect property..!!</h3>
<br>
<br>
</center>


<%
	IIdealHome iidealhome = new IdealHomeDAO();
	List<IdealHome> List = iidealhome.displayIdealHome();
	
	for(IdealHome idealHome : List){
%>

<div class="card">
  <h1><%=idealHome.getTitle() %></h1>
  <p class="title" name="title"><%=idealHome.getDescription() %></p>
  <br>
  <div class="contact">
  	<p name="description">Contact Name: <%=idealHome.getName() %></p>
  	<p name="description">Contact Email: <%=idealHome.getEmail() %></p>
  	<p name="description">Contact Phone number: <%=idealHome.getPnumber() %></p>
  </div>
  <br>
</div>
<br>
<%
	}
%>
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