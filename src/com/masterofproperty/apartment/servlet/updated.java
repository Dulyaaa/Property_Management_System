package com.masterofproperty.apartment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.apartment.services.ApartmentInfo;
import com.masterofproperty.apartment.services.IApartment;
import com.masterofproperty.model.ModelApartment;

/**
 * Servlet implementation class updated
 */
@WebServlet("/updated")
public class updated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updated() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		ModelApartment m1 = new ModelApartment();
		
		m1.setid(Integer.parseInt(request.getParameter("updateId")));
		m1.setname(request.getParameter("inputname"));
		m1.setprice(Integer.parseInt(request.getParameter("inputPrice")));
		m1.setaddress(request.getParameter("inputAddress"));
		m1.setcity(request.getParameter("inputCity"));
		m1.setfloorArea(Integer.parseInt(request.getParameter("inputFloorArea")));
		m1.setNoOfBedRooms(Integer.parseInt(request.getParameter("inputNoOfBedrooms")));
		m1.setdescription(request.getParameter("inputDescription"));
		
		IApartment iap = new ApartmentInfo();
		iap.updateApartment(m1);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/apartment.jsp");
		if(dispatcher!=null)
		{
			dispatcher.forward(request,response);
		}
	}

}
