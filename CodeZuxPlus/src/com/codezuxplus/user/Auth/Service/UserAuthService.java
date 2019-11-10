package com.codezuxplus.user.Auth.Service;

import java.sql.SQLException;

import com.codezuxplus.user.Auth.DAO.UserAuthDAO;
import com.codezuxplus.user.Bean.UserRegisterBean;


public class UserAuthService {

	UserAuthDAO UserDao = new UserAuthDAO();

	
	public int userRedgService(UserRegisterBean userBean) throws SQLException {

		int flag;
		flag = UserDao.redgUser(userBean);
		return flag;
	}
}