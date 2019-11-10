package com.codezuxplus.user.DAO;

import java.sql.*;
import com.codezuxplus.user.Bean.UserRegisterBean;

public class UserDao {
	
	Connection con = null;

	public int registerUser(UserRegisterBean userRedgBean) {

		
		try {
			con = DBConnection.connectdb();
			PreparedStatement p = con.prepareStatement(
					"insert into My_Project.user_auth (Uname,Upass,Uemail,UaccType) values (?,?,?,?)");
			p.setString(1, userRedgBean.getUname());
			p.setString(2, userRedgBean.getUpass());
			p.setString(3, userRedgBean.getUemail());
			p.setString(4, userRedgBean.getUaccType());
			return p.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public boolean userAuthenticate(String uEmail, String uPass) {
		
		try {
			con = DBConnection.connectdb();
			PreparedStatement p = con.prepareStatement("select * from My_Project.user_auth");
			return p.execute();
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		return false;
	}

}
