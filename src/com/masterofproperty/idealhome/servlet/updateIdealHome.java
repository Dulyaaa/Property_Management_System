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
 * Servlet implementation class updateIdealHome
 */
@WebServlet("/updateIdealHome")
public class updateIdealHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdealHomeDAO idealhomeDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateIdealHome() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        idealhomeDAO = new IdealHomeDAO(jdbcURL, jdbcUsername, jdbcPassword);
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
        	updateIdealHome(request,response);
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
	
	private void updateIdealHome(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		
		 String title = request.getParameter("title");
		 String description = request.getParameter("description");
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String number = request.getParameter("phonenumber");
		 int id = Integer.parseInt(request.getParameter("sID"));
	    	
		 IdealHome updateservice = new IdealHome(id, title, description, name, email,number);
		 IIdealHome iidealhome = new IdealHomeDAO();
		 iidealhome.updateIdealHome(updateservice);
		 
	     String msg = "Successfully Updated..!!";
	     request.setAttribute("message", msg);
	        
	     //response.sendRedirect("views/adminPages/idealhome.jsp");
	     
		 response.setContentType("text/html");
		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/idealhome.jsp");
		 dispatcher.forward(request, response);
	}

}
