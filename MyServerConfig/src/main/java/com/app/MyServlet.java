package com.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(urlPatterns = {"/serv1"},
		initParams= {@WebInitParam(name="userName",value="admin"),
		@WebInitParam(name="userPassword",value="admin123"),
		@WebInitParam(name="userName",value="admin"),
		@WebInitParam(name="port",value="3306"),
		
		}
		

		)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletConfig servletConfig;
	private String uname,pwd;
	
	
	
       
   

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		servletConfig =  getServletConfig();
		uname = servletConfig.getInitParameter("username");
		
		
	}

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//pw.write("user="uname);
		
		Enumeration<String> e = servletConfig.getInitParameterNames();
		
		while(e.hasMoreElements())
		{
			String str = e.nextElement();
			pw.print(str+" "+servletConfig.getInitParameter(str)+"<br>");
		}
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
