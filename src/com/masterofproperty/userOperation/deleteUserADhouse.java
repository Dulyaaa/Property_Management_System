package com.masterofproperty.userOperation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.model.House;

/**
 * Servlet implementation class deleteUserADhouse
 */
@WebServlet("/deleteUserADhouse")
public class deleteUserADhouse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteUserADhouse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       try {
	        	deletehouse(request, response);
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
	
private void deletehouse(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        
    	int id = Integer.parseInt(request.getParameter("sID"));
        
        House house = new House(id);
        userAccountDAO uadao = new userAccountDAO();
        uadao.deletehouse(house);
        
        String msg = "Successfully Deleted..!!";
        request.setAttribute("message", msg);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/userAllAdView.jsp");
        dispatcher.forward(request, response);
 
    }

}
