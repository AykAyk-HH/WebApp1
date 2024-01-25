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
 * Servlet implementation class SaveMobile
 */
public class SaveMobile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String mobile = request.getParameter("mobile");
		System.out.println("SaveName ::doGet() mobile = "+mobile);
		
		HttpSession session = request.getSession(false);
		session.setAttribute("mobile", mobile);
		
		RequestDispatcher rd = request.getRequestDispatcher("UserDetails.jsp");
		rd.forward(request, response);
		 
	 }
}
