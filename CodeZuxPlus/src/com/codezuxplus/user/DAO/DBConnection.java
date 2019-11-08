package com.codezuxplus.user.DAO;

/* steps for connecting database in java - JDBC
 * 1. Importing required package: import java.sql.*;
 * 2. Load and register the driver: com.mysql.jdbc.Driver
 * 3. create connection: Connection interface
 * 4. create statement: Statement interface
 * 5. execute the query: 
 * 6. Process the results: 
 * 7. close: connection.close()
 */





import java.sql.*;

public class DBConnection {
	
	public static Connection connectdb() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CodeZuxPlus","root","2856");
		
			System.out.print("Hello");
			
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
