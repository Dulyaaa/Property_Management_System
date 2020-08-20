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
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		 float price = Float.parseFloat(request.getParameter("price"));
		 String address = request.getParameter("address");
		 float perches = Float.parseFloat(request.getParameter("perches"));
		 int noOfBedRooms = Integer.parseInt(request.getParameter("noOfBedRooms"));
		 String description = request.getParameter("description");
		 int hId = Integer.parseInt(request.getParameter("hId")); 
		 
	
		 House house = new House(name, address, description, price, perches, noOfBedRooms, hId);
		 HouseDAO houseDAO = new HouseDAO();
			try {
				houseDAO.addHouse(house);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 response.setContentType("text/html");
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/house.jsp");
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
