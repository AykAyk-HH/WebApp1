package com.expleo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TableOf
 */
public class TableOf extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("num");
		if(s1.equals("ayaan") == true)
		{
			out.println("<h1>Ayaan and V</h1>");
		}
		int n = Integer.parseInt(s1);
		for(int i=1;i<=10;i++)
		{
			out.println("<h1>"+n+" x "+i+" = "+(n*i));
		}
	}

}
