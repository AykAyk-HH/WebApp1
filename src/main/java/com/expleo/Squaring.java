package com.expleo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Squaring
 */
public class Squaring extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("num");
		if(s1.equals("vaishnavi") == true)
		{
			out.println("<h1>V and Ayaan</h1>");
		}
		int n = Integer.parseInt(s1);
		int sq = n*n;
		out.println("<h1>Square of "+n+" is : "+sq);
	}

}
