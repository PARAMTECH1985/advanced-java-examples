package com.jts.controller;
import com.jts.bean.RegistrationBean;
import com.jts.dao.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationControllerServlet
 */
@WebServlet("/RegistrationControllerServlet")
public class RegistrationControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String studentName=request.getParameter("sname");
		String studentEmailId=request.getParameter("email");
		String studentMobileNumber=request.getParameter("mobile");
		out.println(studentName);
		out.println(studentEmailId);
		out.println(studentMobileNumber);
		RegistrationBean rb=new RegistrationBean(studentName,studentEmailId,studentMobileNumber);
		RegistrationDao RegistrationDao = new RegistrationDao();
		RegistrationDao.registerStudent(rb);
		
	}

}
