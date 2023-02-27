package com;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/test")

public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Sum() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int nb1 = Integer.parseInt(request.getParameter("arg1"));
		int nb2 = Integer.parseInt(request.getParameter("arg2"));
		int res = nb1 + nb2;
		PrintWriter out = response.getWriter();
		 	out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Result</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Result</h1>");
	        out.println("<p>The result is " + res + ".</p>");
	        out.println("</body>");
	        out.println("</html>");
	}

}
