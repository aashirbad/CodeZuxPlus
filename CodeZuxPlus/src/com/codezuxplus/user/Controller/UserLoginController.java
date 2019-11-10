package com.codezuxplus.user.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codezuxplus.user.Auth.Service.UserAuthService;

@WebServlet("/UserLoginAction")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		
   		String Uemail = request.getParameter("Uemail");
   		String Upass = request.getParameter("Upass");
   		
   		UserAuthService UAuth = new UserAuthService();
   		
   		
   }

}
