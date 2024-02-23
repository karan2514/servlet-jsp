package com.servlets.learning;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int square = 0;
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c: cookies) {
			if (c.getName().equals("sum")) {
				square = Integer.parseInt(c.getValue());
			}
		}
		
	//int a = (int)req.getAttribute("sum");
	square = square*square;
		PrintWriter out = res.getWriter();
		out.println("square is: "+square);
	}

}

