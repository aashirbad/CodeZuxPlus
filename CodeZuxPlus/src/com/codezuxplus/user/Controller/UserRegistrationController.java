package com.codezuxplus.user.Controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codezuxplus.user.Bean.UserRegisterBean;
import com.codezuxplus.user.DAO.UserRegisterDAO;
import com.codezuxplus.user.Service.UserRegistrationService;

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
		
		
		
		//UserRegisterDAO Udao = new UserRegisterDAO();
		//Udao.registerUser(userRedgBean);
		
		
		/*
		try {
			int flag = userService.userRedgService(userRedgBean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		userService.show(userRedgBean);
		
		*/
		
		
	}
	
	public static void pet() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/CodeZuxPlus";
		String uname = "root";
		String pwd = "2856";
				
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,uname,pwd);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("insert into UAuth values('satya','12','s','std')");
		
		rs.next();
		String name = rs.getString(0);
		System.out.println(name);
		st.close();
		conn.close();
	}

}
