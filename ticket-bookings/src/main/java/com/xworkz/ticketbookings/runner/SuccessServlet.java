package com.xworkz.ticketbookings.runner;



import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/name")
public class SuccessServlet implements Servlet{

	public SuccessServlet() {
		
		System.out.println("this is sevelet constructor");
	}
	@Override
	public void destroy() {
		System.out.println("this is destroy method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
	
		System.out.println("this is sevelet config method");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("this is servelet info method");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("this is init method");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) {
		System.out.println("this is service method");
		System.out.println("request:"+req.getParameter("userName"));
		
	}

}
