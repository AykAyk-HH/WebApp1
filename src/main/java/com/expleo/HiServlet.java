package com.expleo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HiServlet
 */
public class HiServlet extends HttpServlet {
	int cnt;
	@Override
	public void destroy() {
		
	}


	@Override
	public void init() throws ServletException {
		cnt = 0;
	}


	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet called");
		PrintWriter out = response.getWriter();
		cnt++;
		out.println("<h1> Hi "+cnt+" times");
		
	}

}
