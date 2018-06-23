package com.test;

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Connection conn = DriverManager.getConnection(url, "weekend", "0000");
			if (conn != null)
				System.out.println("conn");
			else
				System.out.println("faild");

			PreparedStatement pstmt = conn.prepareStatement("select * from test");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
