package com.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//@Repository
//public class UserDAO2 {
//	@Autowired
//	DataSource dataSource;
//	//	@Resource(name="DBManager")
//	private Connection conn;	
//	private PreparedStatement pstmt;
//	private ResultSet rs; 
//	
//	public UserVO getUser(UserVO vo) {
//		System.out.println("UserDAO call......");
//		//DBManager db = new DBManager();
//		try {
//			conn = dataSource.getConnection();
//			String sql = "select name from mvcuser where id=? and pw=?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, vo.getId());
//			pstmt.setString(2, vo.getPw());
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				vo.setName(rs.getString("name"));
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			//conn.close(rs, pstmt, conn);
//		}
//		return vo;
//	}
//}
