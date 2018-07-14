package com.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.mapper.UserMap;

@Service
public class UserServiceImpl implements UserService {
//	@Autowired
//	private UserDAO userDAO;
	
	@Autowired
	private UserMap userMap;
	
//	
//	public UserServiceImpl(UserDAO a) {
//		 this.userDAO = a;
//	}
//	public void setUserDAOFunc(UserDAO u) {
//		this.userDAO  = u;
//	}
	
	
	public UserVO getUser(UserVO vo){
		//UserDAO userDAO = new UserDAO();
		System.out.println("UserServiceImpl call.....");
		//return userDAO.getUser(vo);
		return userMap.getUser(vo);
	}
}
