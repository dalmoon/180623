//package com.biz.user;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class DBManager {
//
//	public Connection getConnection() {
//		System.out.println("conn");
//		Connection conn = null;
//		try{
//			Class.forName
//			("oracle.jdbc.driver.OracleDriver");
//			String url ="jdbc:oracle:thin:@127.0.0.1:1521:XE";
//			String id="weekend";
//			String pw="0000";
//			conn  =DriverManager.getConnection(url,id,pw);
//			System.out.println("DB 연결 성공!");
//
//		}catch(Exception e){ 
//			e.printStackTrace();
//		}
//		return conn;
//	}
//
//
//	public void close(PreparedStatement pstmt, Connection conn) {
//		System.out.println("close");
//		try{
//			if(pstmt != null) pstmt.close();
//			if(conn != null) conn.close();
//			System.out.println("close success");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try{
//				if(pstmt != null) pstmt.close();
//				if(conn != null) conn.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	public void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
//		System.out.println("close");
//		try{
//			if(rs != null) rs.close();
//			if(pstmt != null) pstmt.close();
//			if(conn != null) conn.close();
//			System.out.println("close success");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try{
//				if(rs != null) rs.close();
//				if(pstmt != null) pstmt.close();
//				if(conn != null) conn.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//
//}
