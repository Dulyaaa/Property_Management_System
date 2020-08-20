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
 * Servlet implementation class updateApartment
 */
@WebServlet("/updateApartment")
public class updateApartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateApartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.getParameter("updateId");
		
		int id = Integer.parseInt(request.getParameter("updateId"));
		IApartment IAP = new ApartmentInfo();
		
		ModelApartment MA = new ModelApartment();
		
		MA = IAP.getApartmanetById(id);
		System.out.println(MA.getdescription());
		System.out.println(MA.getaddress());
		
		
		
		request.setAttribute("data",MA);
		//response.sendRedirect("/WEB-INF/views/apartment/updateApartment.jsp");
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/apartment/updateApartment.jsp");
		if(dispatcher!=null)
		{
			dispatcher.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
