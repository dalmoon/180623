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
//	public UserServiceImpl(UserDAO dao) {
//		this.userDAO = dao;	
//	}
	
//	public void setUserDAOFunc(UserDAO dao){
//		this.userDAO = dao;
//	}
	private void myPrint(){
		
	}
	
	public UserVO getUser(UserVO vo){
		//UserDAO userDAO = new UserDAO();	
		System.out.println("UserServiceImpl call.....");
		return userMap.getUser(vo);
	}
}
