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
 * Servlet implementation class deleteIdealHome
 */
@WebServlet("/deleteIdealHome")
public class deleteIdealHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdealHomeDAO idealhomeDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteIdealHome() {
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
        	deleteIdealHome(request, response);
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
	
	private void deleteIdealHome(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        
    	int id = Integer.parseInt(request.getParameter("sID"));
        
        IdealHome idealhome = new IdealHome(id);
        IIdealHome iidealhome = new IdealHomeDAO();
        iidealhome.deleteIdealHome(idealhome);
        
        String msg = "Successfully Deleted..!!";
        request.setAttribute("message", msg);
        
        //response.sendRedirect("/WEB-INF/views/adminPages/idealhome.jsp");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/adminPages/idealhome.jsp");
        dispatcher.forward(request, response);
 
    }

}
