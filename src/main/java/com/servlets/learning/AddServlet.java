package com.servlets.learning;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int sum = i+j;
		req.setAttribute("sum", sum);
		
		Cookie cookie = new Cookie("sum", sum +"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		/*
		 * PrintWriter out = res.getWriter(); out.println("sum is: "+sum);
		 */
		
		/*
		 * RequestDispatcher rd = req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
	}

}
