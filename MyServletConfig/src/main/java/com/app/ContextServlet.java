package com.app;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ContextServlet
 */
@WebServlet(urlPatterns="/serv2")
public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletContext servletContext;
	private String version1,version2;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }
    
    
    
    

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		servletContext = getServletContext();
		version1 = servletContext.getInitParameter("WebModuleVersion");
		
	}





	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		pw.write("web Module version = "+version1);
		
		pw.write("<br>Apche Tomcat version = "+servletContext.getInitParameter("ApcheTomcat"));
		
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
