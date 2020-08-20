package com.masterofproperty.idealhome.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.model.IdealHome;
import com.masterofproperty.idealhome.services.*;

/**
 * Servlet implementation class insertIdealHome
 */
@WebServlet("/insertIdealHome")
public class insertIdealHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdealHomeDAO serviceDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertIdealHome() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        serviceDAO = new IdealHomeDAO(jdbcURL, jdbcUsername, jdbcPassword);
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			  insertIdealHome(request, response);
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
	
	private void insertIdealHome(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		 
		 String title = request.getParameter("title");
		 String description = request.getParameter("description");
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String number = request.getParameter("phonenumber");
		 int userid = Integer.parseInt(request.getParameter("uID"));
		 
	    	
		 IdealHome newservice = new IdealHome(title, description, name, email,number, userid);
		 IIdealHome iidealhome = new IdealHomeDAO();
		 iidealhome.newIdealHome(newservice);
		 
		 String msg = "Successfully Inserted new Ideal Home..!!";
	     request.setAttribute("message", msg);
		 
		 //response.sendRedirect("views/mainPages/userAccount.jsp");
	     
		 response.setContentType("text/html");
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/mainPages/userAccount.jsp");
		 dispatcher.forward(request, response);

	    }

}
