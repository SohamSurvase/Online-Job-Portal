package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;




@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		HttpSession session =req.getSession();
		session.removeAttribute("userobj");
		session.setAttribute("succMsg", "Logout Successfully.");
		resp.sendRedirect("login.jsp");
	}
}