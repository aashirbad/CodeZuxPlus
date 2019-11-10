package com.codezuxplus.user.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codezuxplus.user.Auth.Service.UserAuthService;
import com.codezuxplus.user.Bean.UserRegisterBean;

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
		
		
		UserAuthService uService = new UserAuthService();
		int flag = 0;
		try {
			flag = uService.userRedgService(userRedgBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(flag);
	
	}
	

}
