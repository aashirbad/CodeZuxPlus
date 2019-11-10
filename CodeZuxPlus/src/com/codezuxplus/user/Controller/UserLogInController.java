package com.codezuxplus.user.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codezuxplus.user.Service.UserService;


@WebServlet("/userLogInAction")
public class UserLogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uEmail = request.getParameter("Uemail") ;
		String uPass = request.getParameter("Upass");
		
		UserService uService = new UserService();
		boolean flag = uService.userAuthenticate(uEmail,uPass);
		if(flag == true)
		{
			response.getWriter().print("You are valide user");
		}
		else
		{
			response.getWriter().print("Could not identified ...Sorry...");
		}
	
	}

}
