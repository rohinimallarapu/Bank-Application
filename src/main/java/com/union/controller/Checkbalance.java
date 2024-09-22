package com.union.controller;

import java.io.IOException;

import com.union.model.Model;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Checkbalance")
public class Checkbalance extends HttpServlet {
	private HttpSession session;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int accno=(Integer) session.getAttribute("accno");
		
		try {
			Model m=new Model();
			m.setAccno(accno);
			
			boolean b=m.Checkbalance();
			
			if(b==true) {
				session.setAttribute("bal", m.getBal());
				response.sendRedirect("/BankingApplication/BalanceView.jsp");
			}
			else {
				response.sendRedirect("/BankingApplication/BalanceFail.html");
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}

}
