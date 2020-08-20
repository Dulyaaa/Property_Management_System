package com.masterofproperty.land.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.land.services.landDAO;
import com.masterofproperty.model.land;

/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String location = request.getParameter("location");
		 float price = Float.parseFloat(request.getParameter("price"));
		 float area = Float.parseFloat(request.getParameter("area"));
		 String description = request.getParameter("description");
		 int userid = Integer.parseInt(request.getParameter("uID")); 
		 
	
		 land land = new land(location, description, price, area, userid);
		 
		 landDAO landdao = new landDAO();
			try {
				landdao.newl(land);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 String msg = "Successfully Inserted new House..!!";
	     request.setAttribute("message", msg);
		 
		 response.setContentType("text/html");
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/mainPages/userAccount.jsp");
		 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
