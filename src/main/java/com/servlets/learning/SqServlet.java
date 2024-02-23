package com.servlets.learning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	int a = (int)req.getAttribute("sum");
	int square = a*a;
		PrintWriter out = res.getWriter();
		out.println("square is: "+square);
	}

}
