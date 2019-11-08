package com.codezuxplus.user.DAO;

import com.codezuxplus.user.Bean.UserRegisterBean;
import java.sql.*;


public class UserRegisterDAO {
	
	public static void main(String[] args) throws Exception {
		
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