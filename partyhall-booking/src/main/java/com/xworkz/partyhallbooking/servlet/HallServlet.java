package com.xworkz.partyhallbooking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/submit")
public class HallServlet extends GenericServlet {
	
	public HallServlet() {
		System.out.println("constructor");
	}
	
	public void service(ServletRequest req, ServletResponse resp) throws IOException {
		
		String userName=req.getParameter("enterUserName");
		System.out.println("enter name:"+userName);
		
		String contactNumber=req.getParameter("enterContactNumber");
		System.out.println("enter number:"+contactNumber);
		
		String email=req.getParameter("enterEmail");
		System.out.println("enter email:"+email);
		
		String alternativeNumber=req.getParameter("enterNumber");
		System.out.println("enter number:"+alternativeNumber);
		
		String time=req.getParameter("enterTime");
		System.out.println("enter time:"+time);
		
		String amount=req.getParameter("enterAmount");
		System.out.println("enter Amount:"+amount);
		
		String place=req.getParameter("enterPlace");
		System.out.println("enter place:"+place);
		
		String people=req.getParameter("enterNumberOfPeople");
		System.out.println("enter number of people:"+people);
		
		req.getContentType();
		resp.setContentType("html");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("thank you for registration");
		printWriter.close();
		
	}

}
