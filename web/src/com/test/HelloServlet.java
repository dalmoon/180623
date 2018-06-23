package com.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloService
 */
//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get call");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post call");
		ArrayList<String> list = new ArrayList<String>();

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
				// System.out.println(rs.getString("name"));
				list.add(rs.getString("name"));
			}
			request.setAttribute("LVL_LIST", list);
			RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
