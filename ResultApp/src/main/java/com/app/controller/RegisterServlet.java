package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.dao.StudentDao;

import bean.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/regServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int prn = Integer.parseInt(request.getParameter("textPrn"));
		String name = request.getParameter("textName");
		float m1 = Float.parseFloat(request.getParameter("textM1"));
		float m2 = Float.parseFloat(request.getParameter("textM2"));
		float m3 = Float.parseFloat(request.getParameter("textM3"));

		Student s = new Student();
		s.setPrn(prn);
		s.setName(name);
		s.setS1(m1);
		s.setS2(m2);
		s.setS3(m3);

		int status = StudentDao.registerStudent(s);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (status > 0) {
		    out.println("<h2>Registration Successful!</h2>");
		} else {
		    out.println("<h2>Error during registration. Try again.</h2>");
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
