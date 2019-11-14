package com.codezuxplus.user.Service;

import com.codezuxplus.user.Bean.UserRegisterBean;
import com.codezuxplus.user.DAO.UserDao;

public class UserService {

	UserDao userDao  = new UserDao();
	public int userRegistration(UserRegisterBean userRedgBean) {
		
		return userDao.registerUser(userRedgBean) ;
	}
	public int userAuthenticate(String uEmail, String uPass) {
		
		return userDao.userAuthenticate(uEmail,uPass);
	}
	
	// Course selection
	public void courseSelection (UserRegisterBean userRedgBean)
	{
		
	}
	// Course Taken User
	public int userCourseTaken(int uid, int cId,String course_name) {
		
		return userDao.userCoursesTAken(uid,cId,course_name);
		
	}
	// whether user is taken or not
	public int checkUserCourseTaken(int uid, int cId) {
		return userDao.checkUserCOurseTaken(uid,cId);
		
	}

}
