package com.union.controller;

import java.io.IOException;



import com.union.model.Model;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	@Override
	protected void service(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
			throws jakarta.servlet.ServletException, IOException {

		String npwd = request.getParameter("npwd");
		String cpwd = request.getParameter("cpwd");
		if(npwd.equals(cpwd)) {
			jakarta.servlet.http.HttpSession session = request.getSession();

			int accno = (Integer) session.getAttribute("accno");

			try {
				Model m = new Model();
				m.setAccno(accno);
				m.setPwd(npwd);
				boolean b = m.changePwd();
				if(b==true) {
					response.sendRedirect("/BankingApplication/ChangePwdSuccess.html");
				}
				else {
					response.sendRedirect("/BankingApplication/ChangePwdFail.html");
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			response.sendRedirect("/BankingApplication/ChangePwdFail.html");
		}

	}
}

