package com.masterofproperty.house.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.house.service.HouseDAO;
import com.masterofproperty.model.House;

/**
 * Servlet implementation class HousesServlet
 */
@WebServlet("/HousesServlet")
public class insertuserHouse extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private HouseDAO houseDAO = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertuserHouse() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			  insert(request, response);
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void insert(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{

		String name = request.getParameter("name");
		 float price = Float.parseFloat(request.getParameter("price"));
		 String address = request.getParameter("address");
		 float perches = Float.parseFloat(request.getParameter("perches"));
		 int noOfBedRooms = Integer.parseInt(request.getParameter("noOfBedRooms"));
		 String description = request.getParameter("description");
		 int userid = Integer.parseInt(request.getParameter("uID")); 
		 
	
		 House house = new House(name, address, description, price, perches, noOfBedRooms, userid);
		 HouseDAO houseDAO = new HouseDAO();
			houseDAO.addHouse(house);
		 
		 String msg = "Successfully Inserted new House..!!";
	     request.setAttribute("message", msg);
		 
		 response.setContentType("text/html");
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/mainPages/userAccount.jsp");
		 dispatcher.forward(request, response);
		
		/*String operation = null;
		if(operation.equalsIgnoreCase("Add")){
			 houseDAO.addHouse(house);
			 request.setAttribute("house",house);
		 }else if(operation.equalsIgnoreCase("delete")){
			 houseDAO.deleteHouse(house);
			 
		 }*/
		 
	}
}
