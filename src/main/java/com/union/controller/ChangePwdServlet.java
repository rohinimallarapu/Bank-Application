package com.union.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ChangePwdServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String npwd = request.getParameter("npwd");
		String cpwd = request.getParameter("cpwd");
		if(npwd.equals(cpwd)) {
			response.sendRedirect("/BankingApplication/ChangePwdSuccess.html");
		}
		else {
			((HttpServletResponse) response).sendRedirect("/BankingApplication/ChangePwdFail.html");
		}
	}

}
