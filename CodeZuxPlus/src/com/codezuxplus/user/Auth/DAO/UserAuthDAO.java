package com.codezuxplus.user.Auth.DAO;

import com.codezuxplus.user.Bean.UserRegisterBean;
import com.mysql.jdbc.Connection;
import java.sql.*;


public class UserAuthDAO {
	
	public int redgUser(UserRegisterBean Ubean) {
		
		Connection conn = null;
		conn = (Connection) DBConnection.connectdb();
		
		try {
			PreparedStatement ps = conn.prepareStatement("insert into CodeZuxPlus.user_auth" + "(Uname,Upass,Uemail,UaccType) values(?,?,?,?)");
		    ps.setString(1, Ubean.getUname());
		    ps.setString(2, Ubean.getUpass());
		    ps.setString(3, Ubean.getUemail());
		    ps.setString(4, Ubean.getUaccType());
		    return ps.executeUpdate();
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return 0;
	}

}
