package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SearchEnginServlet
 */
@WebServlet(urlPatterns ={"/SearchServlet"})
public class SearchEnginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SearchEnginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String data = request.getParameter("textData");
		String engin = request.getParameter("engin");
		
		try {
			if(data.trim().length()==0)
			{
				throw new Exception();
			}
			else if(engin == null)
			{
				throw new Exception();
			}
			
			String url="";
			
			if(engin.equals("google"))
			{
				url = "https://www.google.co.in/search?q="+data;
			}
			if(engin.equals("yahoo"))
			{
				url = "https://in.search.yahoo.com/search?p="+data;
			}
			if(engin.equals("bing"))
			{
				url = "https://www.bing.com/search?q="+data;
			}
			
			response.sendRedirect(url);
			
		}
		catch(Exception e)
		{
			response.sendRedirect("error.html");
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
