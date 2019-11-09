package com.codezuxplus.user.Controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codezuxplus.user.Bean.UserRegisterBean;
import com.codezuxplus.user.Service.UserService;



@WebServlet("/UserRegistrationAction")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserRegisterBean userRedgBean = new UserRegisterBean();
		
		String Uname = request.getParameter("Uname");
		String Upass = request.getParameter("Upass");
		String Uemail = request.getParameter("Uemail");
		String UaccType = request.getParameter("UaccType");
		
		
		
		userRedgBean.setUname(Uname);
		userRedgBean.setUpass(Upass);
		userRedgBean.setUemail(Uemail);
		userRedgBean.setaccType(UaccType);
		
		
		UserService uService = new UserService();
		int flag;
		flag = uService.userRegistration(userRedgBean);
		System.out.println(flag);
	
	}
	

}
