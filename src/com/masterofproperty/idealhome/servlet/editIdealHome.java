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
 * Servlet implementation class editIdealHome
 */
@WebServlet("/editIdealHome")
public class editIdealHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IdealHomeDAO idealhomeDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editIdealHome() {
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
			  showEditForm(request, response);
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
        int id = Integer.parseInt(request.getParameter("sID"));
        
        IdealHome editIdealhome = idealhomeDAO.getIdealhome(id);
        
        //response.sendRedirect("views/idealhome/updateIdealHome.jsp");
        
        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/idealhome/updateIdealHome.jsp");
        request.setAttribute("idealhome", editIdealhome);
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
