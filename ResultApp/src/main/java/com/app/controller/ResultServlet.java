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
 * Servlet implementation class ResultServlet
 */
@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ResultServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter pw = response.getWriter();

	    try {
	        String prnParam = request.getParameter("textPrn");

	        if (prnParam == null || prnParam.trim().isEmpty()) {
	            response.sendRedirect("details.html");
	            return;
	        }

	        int prn = Integer.parseInt(prnParam.trim());
	        Student s = StudentDao.getStudentByPrn(prn);

	        if (s == null) {
	            // PRN not found → redirect to register page
	            response.sendRedirect("details.html");
	            return;
	        }

	        // Display result
	        pw.write("<html><body><h2>Student Result</h2>");
	        pw.write("<table border='1' cellpadding='10'>");
	        pw.write("<tr><th>Id</th><th>PRN</th><th>Name</th><th>C Marks</th><th>CPP Marks</th><th>Java Marks</th></tr>");
	        pw.write("<tr>");
	        pw.write("<td>" + s.getId() + "</td>");
	        pw.write("<td>" + s.getPrn() + "</td>");
	        pw.write("<td>" + s.getName() + "</td>");
	        pw.write("<td>" + s.getS1() + "</td>");
	        pw.write("<td>" + s.getS2() + "</td>");
	        pw.write("<td>" + s.getS3() + "</td>");
	        pw.write("</tr>");
	        pw.write("</table>");
	        pw.write("<br><a href='index.html'>Search Another</a>");
	        pw.write("</body></html>");

	    } catch (NumberFormatException e) {
	        response.sendRedirect("index.html"); // invalid PRN format
	    } catch (Exception e) {
	        e.printStackTrace();
	        pw.write("<html><body><h2>Internal Error Occurred.</h2></body></html>");
	    }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
