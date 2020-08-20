package com.masterofproperty.userOperation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.user.user;


/**
 * Servlet implementation class updateUserDetails
 */
@WebServlet("/updateUserDetails")
public class updateUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	userAccountDAO userdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateUserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        userdao = new userAccountDAO(jdbcURL, jdbcUsername, jdbcPassword);
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
        	updateUser(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		String password = request.getParameter("password");
	
		int id = Integer.parseInt(request.getParameter("uID"));
	    	
		 user user = new user(id, firstname, lastname, email, country, password);
		 userdao.updateUser(user);
		 
		 String msg = "Successfully Updated user details..!!";
	     request.setAttribute("message", msg);
		 
	     response.setContentType("text/html");
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/mainPages/userAccount.jsp");
		 dispatcher.forward(request, response);
	}
	
}
