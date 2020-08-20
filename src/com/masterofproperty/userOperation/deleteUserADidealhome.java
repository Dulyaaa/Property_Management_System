package com.masterofproperty.userOperation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.masterofproperty.model.IdealHome;

/**
 * Servlet implementation class deleteUserAD
 */
@WebServlet("/deleteUserAD")
public class deleteUserADidealhome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private userAccountDAO uadao; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteUserADidealhome() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
 
        uadao = new userAccountDAO(jdbcURL, jdbcUsername, jdbcPassword);
 
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
        userAccountDAO uadao = new userAccountDAO();
        uadao.deleteIdealHome(idealhome);
        
        String msg = "Successfully Deleted..!!";
        request.setAttribute("message", msg);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/userAllAdView.jsp");
        dispatcher.forward(request, response);
 
    }

}
