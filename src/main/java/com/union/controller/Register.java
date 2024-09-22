package com.union.controller;

import java.io.IOException;

import com.union.model.Model;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String custid=request.getParameter("custid");
		
		String saccno=request.getParameter("accno");//Collects the data in form of string
		int accno=Integer.parseInt(saccno);//Converts string data to int data
		
		String pwd=request.getParameter("pwd");
		
		String sbal=request.getParameter("bal");//Collects the data in form of string
		int bal=Integer.parseInt(sbal);//Converts string data to int data
		
		String email=request.getParameter("email");
		
		try {
			Model m=new Model();
			m.setName(name);
			m.setCustid(custid);
			m.setAccno(accno);
			m.setPwd(pwd);
			m.setBal(bal);
			m.setEmail(email);
			
			boolean b=m.register();
			
			if(b==true) {
				response.sendRedirect("/BankingApplication/SuccessReg.html");
			}
			else {
				response.sendRedirect("/BankingApplication/FailureReg.html");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
