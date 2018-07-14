package com.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserDAO {
//	@Autowired
//	SqlSession conn;
//	
//	public UserVO getUser(UserVO userVO) {
//		System.out.println("UserDAO call......");
//		//try {
//		return conn.selectOne("userNameSpace.getUser", userVO);
//		//}catch(Exception e) {e.printStackTrace();} 
//		//return userVO;
//	}
//}
