package com.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemSignUp
 */
@WebServlet("/mSignUp")
public class MemSignUp extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("--doGet()--");
		
		String m_name = request.getParameter("m_name");
		
		System.out.println("m_name : " + m_name);
		
		//form 태그에서 넘어온 data의 이름을 읽을 때 
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			System.out.println(name);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--doPost()--");
		
		doGet(request, response);
	}

}
