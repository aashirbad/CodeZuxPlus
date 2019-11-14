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
		
		// It gets the uid if the user is already a registered user
		int flag = uService.userAuthenticate(uEmail,uPass);
		if(flag != 0)
		{
			response.getWriter().print("You are valide user");
			request.getSession().setAttribute("uid", flag);
			request . getRequestDispatcher("CourseList.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("Could not identified ...Sorry...");
			response.sendRedirect("login.jsp");
		}
	}
}
