package com.masterofproperty.userValidation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.masterofproperty.user.*;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private loginValidDAO logindao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		user user = new user();
		user.setEmail(email);
		user.setPassword(password);
		
		logindao = new loginValidDAO();
		
		String valid = logindao.validuser(user);
		int uID = logindao.getUID();
		String fname = logindao.getFirstname();
		
		System.out.println(uID);
		System.out.println(valid);
		System.out.println(fname);
		
		if(valid.equalsIgnoreCase("SUCCESS")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("user", email);
			session.setAttribute("userID", uID);
			session.setAttribute("firstname", fname);
			session.setMaxInactiveInterval(1*60);
			
			 response.setContentType("text/html");
			 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/mainPages/userAccount.jsp");
			 dispatcher.forward(request, response);
			
			//response.sendRedirect("/WEB-INF/views/mainPages/userAccount.jsp");

		}
		
		else
		{
			System.out.println("Error message = "+valid);
			request.setAttribute("errMessage", valid);

			response.setContentType("text/html");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
			 
			//response.sendRedirect("/WEB-INF/views/mainPages/login.jsp");
			//request.getRequestDispatcher("views/mainPages/login.jsp").forward(request, response);
		}

		
	}

}
