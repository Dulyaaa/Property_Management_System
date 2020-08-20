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
 * Servlet implementation class editUserDetails
 */
@WebServlet("/editUserDetails")
public class editUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private userAccountDAO accountdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editUserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        accountdao = new userAccountDAO(jdbcURL, jdbcUsername, jdbcPassword);
 
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		
        int id = Integer.parseInt(request.getParameter("uID"));
        
        user user = accountdao.getUser(id);
        
        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/userAccount/editAccountSettings.jsp");
        request.setAttribute("user", user);
        dispatcher.forward(request, response);
	}

}
