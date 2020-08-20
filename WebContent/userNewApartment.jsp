<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Apartment</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 
</head>
<body>
<br/>
<style>
body {
  background-image: url('images/img3.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>
 <jsp:include page="header.jsp"></jsp:include>
 
 <br/><br/>
 
 	<div class="upperBar">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Logged in as: <%=session.getAttribute("firstname") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<%=session.getAttribute("user") %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="gotoAccounr">My Account</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="logout">Log Out</a>
	</div>
	
 <%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
	
		response.setHeader("Pragma", "no-cache");//HTTP 1.0
		
		response.setHeader("Expires", "0");//proxies
	
	%>
<div class="card" style="width: 85rem; margin-left:5rem;">
<span class="border border-dark">
  <div class="card-body">
    <form method="post" action="AddApartment" >
  <div class="form-row">
    <div class="form-group col-md-4">
      <label for="inputname">Name</label>
      <input type="text" class="form-control" id="inputname" name="inputname" value="" required>
    </div>
    <div class="form-group col-md-4">
      <label for="inputPrice">Price</label>
      <input type="number" class="form-control" id="inputPrice" name="inputPrice" value="" required >
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Flower Street" value="" required>
  </div>
  <div class="form-group">
    <label for="inputCity">City</label>
    <input type="text" class="form-control" id="inputCity" name="inputCity" placeholder="Colombo" value="" required>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputFloorArea">Floor Area</label>
      <input type="number" class="form-control" id="inputFloorArea" name="inputFloorArea" value="" required>
    </div>
    <div class="form-group col-md-6">
      <label for="inputNoOfBedrooms">No of Bedrooms</label>
       <input type="number" class="form-control" id="inputNoOfBedrooms" name="inputNoOfBedrooms" value="" required>
    </div></div>
    <div class="form-group ">
      <label for="inputDescription">Description</label>
      <input type="text" class="form-control" id="inputDescription" name="inputDescription" value="" required>
    </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck" value="">
      <input type="hidden" name="uID" value="<%=session.getAttribute("userID") %>" />
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary" id ="submit" value ="submit">Submit</button>
</form>
  </div>
  </span>
</div>
   <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

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