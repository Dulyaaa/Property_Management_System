<%@page import="com.masterofproperty.model.IdealHome" %>
<%@page import="com.masterofproperty.idealhome.services.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ideal Home Admin</title>

<link rel=stylesheet type="/text/css" href="<%= request.getContextPath() %>../css/adminTable.css">
<style> <%@ include file="../../../css/adminTable.css"%></style>	
</head>
<body>
<div class="header">
<jsp:include page="../../../header.jsp"></jsp:include>
</div>
<br><br>

	
<center><h1>Welcome To Ideal Home Admin Page</h1></center><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<a href="logout"> <input type="submit" class="button3" value="Log Out"></a>
<br>
<br>
<br>
<a href="adminNewIdealhome.jsp"> <input type="submit" class="button" value="Create a new Ideal Home AD"></a>
<br>
<br>
<br>
<table>
	<thead>
	<tr>
		<th>ID</th>
		<th>Title</th>
		<th>Description</th>
		<th>Contact Name</th>
		<th>Contact Email</th>
		<th>Contact Phone Number</th>
		<th>Action</th>
		<th></th>
	</tr>
	<thead>
	<tbody>
	<%
		IIdealHome iidealhome = new IdealHomeDAO();
		List<IdealHome> List = iidealhome.displayIdealHomeWithID();
		
		for(IdealHome idealHome : List){
	%>
	<tr>
		<td><%= idealHome.getsID() %></td>
		<td><%= idealHome.getTitle() %></td>
		<td><%= idealHome.getDescription() %></td>
		<td><%= idealHome.getName() %></td>
		<td><%= idealHome.getEmail() %></td>
		<td><%= idealHome.getPnumber() %></td>
		<td>
			<form method="POST" action="editIdealHome">
				<input type="hidden" name="sID" value="<%= idealHome.getsID()%>" /> 
				<input type="submit" value="Update" class="button1"/>
			</form>		
		</td>
		<td>
			<form method="POST" action="deleteIdealHome">
				<input type="hidden" name="sID" value="<%= idealHome.getsID()%>" /> 
				<input type="submit" value="Delete" class="button2"/>
			</form>
		</td>

	</tr>
		
	<%	
		}
    %> 
    <tr>
    <br>
		<span style="color:red"><%=(request.getAttribute("message") == null) ? "" : request.getAttribute("message")%></span>
	
	</tr>
    </tbody>
</table>
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
        <script src="js/scripts.js"></script>
        
        
</body>
</html>