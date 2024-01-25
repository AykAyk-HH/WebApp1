package com.expleo.controller;
import com.expleo.model.Emp;
import com.expleo.repo.EmpDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class EmpController
 */
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int salary = Integer.parseInt(request.getParameter("salary"));
		EmpDao dao1 = new EmpDao();
		dao1.save(new Emp(id, name, salary));
		System.out.println("Data added to table");
		 
	}

}
