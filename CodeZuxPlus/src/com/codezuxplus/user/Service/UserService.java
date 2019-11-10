package com.codezuxplus.user.Service;

import com.codezuxplus.user.Bean.UserRegisterBean;
import com.codezuxplus.user.DAO.UserDao;

public class UserService {

	UserDao userDao  = new UserDao();
	public int userRegistration(UserRegisterBean userRedgBean) {
		
		return userDao.registerUser(userRedgBean) ;
	}
	public boolean userAuthenticate(String uEmail, String uPass) {
		
		return userDao.userAuthenticate(uEmail,uPass);
	}
	
	

}
