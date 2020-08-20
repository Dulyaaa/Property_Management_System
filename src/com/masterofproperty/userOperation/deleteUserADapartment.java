package com.masterofproperty.userOperation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.model.ModelApartment;

/**
 * Servlet implementation class deleteUserADapartment
 */
@WebServlet("/deleteUserADapartment")
public class deleteUserADapartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteUserADapartment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       try {
	        	deleteapartment(request, response);
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
	
	private void deleteapartment(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        
    	int id = Integer.parseInt(request.getParameter("sID"));
    	System.out.println(id);
        
        ModelApartment apartment = new ModelApartment(id);
        userAccountDAO uadao = new userAccountDAO();
        uadao.deleteapartment(apartment);
        
        String msg = "Successfully Deleted..!!";
        request.setAttribute("message", msg);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/userAllAdView.jsp");
        dispatcher.forward(request, response);
 
    }

}
