package com.expleo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SaveName
 */
public class SaveName extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		System.out.println("SaveName ::doGet() name = "+name);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("name", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("SessionPage2.html");
		rd.forward(request, response);
	}

}
