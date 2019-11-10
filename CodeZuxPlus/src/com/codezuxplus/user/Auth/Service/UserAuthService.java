package com.codezuxplus.user.Auth.Service;

import java.sql.SQLException;

import com.codezuxplus.user.Auth.Bean.UserTypeBean;
import com.codezuxplus.user.Auth.DAO.UserAuthDAO;
import com.codezuxplus.user.Bean.UserRegisterBean;


public class UserAuthService {

	UserAuthDAO UserDao = new UserAuthDAO();

	
	public int userRedgService(UserRegisterBean userBean) throws SQLException {

		int flag;
		flag = UserDao.redgUser(userBean);
		return flag;
	}
	
	// create User type - So data view can be done accordingly
	public UserTypeBean TypeCheckerService(String Uname,String Uemail, String UaccType, int Uid) {
		UserTypeBean UtypeService = new UserTypeBean();
		
		UtypeService.setUid(Uid);
		UtypeService.setUname(Uname);
		UtypeService.setUemail(Uemail);
		UtypeService.setUaccType(UaccType);
		
		return UtypeService;
	}
}