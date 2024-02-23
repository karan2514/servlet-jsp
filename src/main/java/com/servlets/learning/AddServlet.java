package com.servlets.learning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		out.println("Hi ");
		
		ServletConfig config = getServletConfig();
		
		String str = config.getInitParameter("name");
		out.println(str);
	}

}
