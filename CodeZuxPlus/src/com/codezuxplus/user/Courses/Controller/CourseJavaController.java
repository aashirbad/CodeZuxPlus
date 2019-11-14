package com.codezuxplus.user.Courses.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codezuxplus.user.Service.UserService;

@WebServlet("/courseJavaAction")
public class CourseJavaController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int uid = (Integer) request.getSession().getAttribute("uid");
		int  cId = 1216;
		String course_name = "java";
		
		UserService uService = new UserService();
		
	 int tc = 	uService.checkUserCourseTaken(uid,cId);
		
		
		
		int f = uService.userCourseTaken(uid,cId,course_name);
		
		if (f != 0)
		{
			request.getSession().setAttribute("cmessg", "Hey you have successfully registered this course ");
			request.getRequestDispatcher("CourseList.jsp").forward(request, response);
		}
		else
			request.getSession().setAttribute("cmessg", "Opps... try again ..");
		request.getRequestDispatcher("CourseList.jsp").forward(request, response);
	}

}
