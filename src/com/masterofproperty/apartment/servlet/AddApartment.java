package com.masterofproperty.apartment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.model.ModelApartment;
import com.masterofproperty.apartment.services.*;

/**
 * Servlet implementation class AddApartment
 */
@WebServlet("/AddApartment")
public class AddApartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddApartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		ModelApartment m1 = new ModelApartment();
		
		
		m1.setname(request.getParameter("inputname"));
		m1.setprice(Integer.parseInt(request.getParameter("inputPrice")));
		m1.setaddress(request.getParameter("inputAddress"));
		m1.setcity(request.getParameter("inputCity"));
		m1.setfloorArea(Integer.parseInt(request.getParameter("inputFloorArea")));
		m1.setNoOfBedRooms(Integer.parseInt(request.getParameter("inputNoOfBedrooms")));
		m1.setdescription(request.getParameter("inputDescription"));
		m1.setUserID(Integer.parseInt(request.getParameter("uID")));
		
		IApartment iap = new ApartmentInfo();
		iap.addApartmentInfo(m1);
		
		String msg = "Successfully Inserted new Apartment..!!";
	    request.setAttribute("message", msg);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/mainPages/userAccount.jsp");
		if(dispatcher!=null)
		{
			dispatcher.forward(request,response);
		}
	}

}
