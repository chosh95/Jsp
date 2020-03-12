package com.servletLifeCycle;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletLifeCycle
 */
@WebServlet("/slc")
public class servletLifeCycle extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--doGet()--");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("--PostConstruct--");
	}
	
	@Override
	public void init() {
		System.out.println("--init()--");
	}
	
	@Override
	public void destroy() {
		System.out.println("--destroy()--");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("--PreDestroy()--");
	}
}
