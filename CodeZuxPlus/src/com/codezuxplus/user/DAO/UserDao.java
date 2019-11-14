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

	public int userAuthenticate(String uEmail, String uPass) {
		
	try {
			con = DBConnection.connectdb();
			PreparedStatement p = con.prepareStatement("select * from My_Project.user_auth where Uemail = ? and Upass = ?");
			p.setString(1, uEmail);
			p.setString(2, uPass);
			ResultSet rs = p.executeQuery();
			if(rs.next())
				{
				return(rs.getInt("uid"));
			
				
			}
			else {
				System.out.println("Not Valide");
				return 0;
			}
		
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		return 0;
	}

	public int userCoursesTAken(int uid, int cId,String course_name) {
		
		try {
			con = DBConnection.connectdb();
			PreparedStatement p = con.prepareStatement(
					"insert into My_Project.course_taken (uid,course_id,course_name) values (?,?,?)");
			p.setInt(1,uid );
			p.setInt(2, cId);
			p.setString(3, course_name);
			
			return p.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int checkUserCOurseTaken(int uid, int cId) {
		
try {
		con = DBConnection.connectdb();
		PreparedStatement p = con.prepareStatement("select * from My_Project.course_taken where uid = ? and course_id = ?");
		p.setInt(1, uid);
		p.setInt(2, cId);
		ResultSet rs = p.executeQuery();
		if(rs.next())
			{
			return 1;
		}
		else {
			
			return 0;
		}
}
	catch (Exception e) {
		e.printStackTrace();
	}
return 1;
	
	
		
		
	}

		
	}


