package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");//MIME Type
		
		PrintWriter pw = response.getWriter();
		
		String uname= request.getParameter("textUsername");
		
		String pwd= request.getParameter("textPassword");
		
		if(uname.equals("admin")&& pwd.equals("admin123"))
		{
			pw.write("<br>Login successFull"+uname);
		}
		else
		{
			pw.write("<br>Invalid UserName or Password");
		}
		
		String num1= request.getParameter("textnum1");
		String num2= request.getParameter("textnum2");
		
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		int sum = number1 + number2;

		pw.write("Addition of numbers"+sum);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
