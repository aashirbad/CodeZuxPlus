package com.codezuxplus.user.Auth.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection connectdb() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/My_Project","root","cool");
			return conn;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void main(String args[]) {
		if(connectdb() != null) {
			System.out.print("Connected");
		}
	}
}
