package com.masterofproperty.userValidation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class adminLoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name= request.getParameter("username");
		String pass= request.getParameter("password");
		
		if (name.equals("house")&& pass.equals("house")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			session.setAttribute("userID", 100);
			session.setMaxInactiveInterval(1*60);
			
			//response.sendRedirect("");
			response.setContentType("text/html");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/house.jsp");
			dispatcher.forward(request, response);
		}
		else if (name.equals("apartment")&& pass.equals("apartment")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			session.setAttribute("userID", 200);
			session.setMaxInactiveInterval(1*60);
			
			//response.sendRedirect("Adminapartment.jsp");	
			response.setContentType("text/html");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/apartment.jsp");
			dispatcher.forward(request, response);
		
		}
		else if (name.equals("land")&& pass.equals("land")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			session.setAttribute("userID", 300);
			session.setMaxInactiveInterval(1*60);
			
			//response.sendRedirect("success.jsp");
			response.setContentType("text/html");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/land.jsp");
			dispatcher.forward(request, response);
		}
		else if (name.equals("idealhome")&& pass.equals("idealhome")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			session.setAttribute("userID", 400);
			session.setMaxInactiveInterval(1*60);
			
			//response.sendRedirect("/WEB-INF/views/adminPages/idealhome.jsp");
			response.setContentType("text/html");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/adminPages/idealhome.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/adminLogin.jsp");
			dispatcher.forward(request, response);
		}
		   }

	}

		
	


