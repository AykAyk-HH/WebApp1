package com.expleo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculateSquare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("num");
		int n = Integer.parseInt(s1);
		int sq = n*n;
		request.setAttribute("squaredNum", sq);
		RequestDispatcher rd = request.getRequestDispatcher("CalculateSquare.jsp");
		rd.forward(request, response);
		//out.println("<h1>Square of "+n+" is : "+sq);
	}

}
