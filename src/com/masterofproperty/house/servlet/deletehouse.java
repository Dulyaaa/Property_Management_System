package com.masterofproperty.house.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.apartment.services.ApartmentInfo;
import com.masterofproperty.apartment.services.IApartment;
import com.masterofproperty.house.service.HouseDAO;

/**
 * Servlet implementation class deletehouse
 */
@WebServlet("/deletehouse")
public class deletehouse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletehouse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.getParameter("deleteId");
		System.out.println(request.getParameter("deleteId"));
		int id = Integer.parseInt(request.getParameter("deleteId"));
		HouseDAO housedao = new HouseDAO();
		
		try {
			boolean issuccess = housedao.deleteHouse(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/house.jsp");
		if(dispatcher!=null)
		{
			dispatcher.forward(request,response);
		}
	}

}
