package com.codezuxplus.user.Auth.DAO;

import com.codezuxplus.user.Auth.Bean.UserTypeBean;
import com.codezuxplus.user.Auth.Service.UserAuthService;
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
	
	public boolean authUser(String Uemail, String Upass) {
		
		boolean state=false;
		Connection conn = (Connection) DBConnection.connectdb();
		try {
			PreparedStatement ps = conn.prepareStatement("select Uemail, Upass from CodeZuxPlus where Uemail=(?) and Upass=(?)");
			ps.setString(1, Uemail);
			ps.setString(2, Upass);
			ResultSet rs = ps.executeQuery();
			
			String Uname = null;
			String UaccType = null;
			int Uid = 0;
			
			UserAuthService UTypeservice = new UserAuthService();
			UTypeservice.TypeCheckerService(Uname,Uemail,UaccType,Uid);
			
			
			if(rs.next()) {
				state =  true;
			}
			else {
				state = false;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();			
		}
		
		return state;
	}
	
	

}


