package com.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
//	public UserServiceImpl(UserDAO dao) {
//		this.userDAO = dao;
//	}
	
//	public void setUserDAOFunc(UserDAO dao){
//		this.userDAO = dao;
//	}
	
	public UserVO getUser(UserVO vo){
		//UserDAO userDAO = new UserDAO();	
		System.out.println("UserServiceImpl call.....");
		return userDAO.getUser(vo);
	}
}
