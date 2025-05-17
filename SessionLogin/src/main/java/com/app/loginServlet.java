package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/servlet1")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		String uname= request.getParameter("textUname");
		String pwd= request.getParameter("textPassword");
		
		if(uname.equals("admin")&&(pwd.equals("admin123")))
		{
			pw.write("<div class=\"welcome-box\">");
			pw.write("<h2>Welcome!</h2>");
			pw.write("<p class=\"success-message\">Login Successful ✅</p>"); 
			pw.write("</div>");
			HttpSession session=request.getSession();
			
			session.setAttribute("name", uname);
			session.setAttribute("password", pwd);
		}
		else
		{
			pw.write("<br>Invalid Username or Password");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
