package com.expleo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.expleo.repo.EmpDao;

/**
 * Servlet implementation class EmpControllerShow
 */
public class EmpControllerShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		EmpDao obj = new EmpDao();
		//System.out.println(obj.getEmp(id).getEmpno());
		request.setAttribute("id", obj.getEmp(id).getEmpno());
		request.setAttribute("name", obj.getEmp(id).getName());
		request.setAttribute("salary", obj.getEmp(id).getSalary());
		RequestDispatcher rd=request.getRequestDispatcher("showData.jsp");
		rd.forward(request, response);
		
//		out.printf("\n %2d | %15s | %.2f",obj.getEmp(id).getEmpno(),obj.getEmp(id).getName(),obj.getEmp(id).getSalary());
	}

}
