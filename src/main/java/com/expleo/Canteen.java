package com.expleo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Canteen extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Biryani");
		lst.add("Chicken idli");
		lst.add("Chicken Samosa");
		lst.add("Chicken Coffee");
		lst.add("Chicken Sandwich");
		request.setAttribute("menuList", lst);
		RequestDispatcher rd = request.getRequestDispatcher("Canteen.jsp");
		rd.forward(request, response);
		
	}

}
