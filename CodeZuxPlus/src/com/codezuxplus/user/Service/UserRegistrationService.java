package com.codezuxplus.user.Service;

import java.sql.SQLException;

import com.codezuxplus.user.Bean.UserRegisterBean;
import com.codezuxplus.user.DAO.UserRegisterDAO;

public class UserRegistrationService {
	
	UserRegisterDAO UserDao = new UserRegisterDAO();
	
	public void userRedgService(UserRegisterBean userBean) throws SQLException {
		int flag;
		
		//flag = UserDao.registerUser(userBean);
		//return flag;
		
	}
	
	public void show(UserRegisterBean userRedgBean) {
		//UserDao.daoShow(userRedgBean);		
	}

}
