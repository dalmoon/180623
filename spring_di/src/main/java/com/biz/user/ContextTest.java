package com.biz.user;

import java.io.Reader;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextTest {

	public static void main(String[] args) {
		// //--------------------------------
		// // Mybatis session build
		// //-----------------------------
		// String path2 = "config-mybatis.xml";
		// Reader reader;
		// try {
		// reader = Resources.getResourceAsReader(path2);
		// SqlSessionFactory dbManager = new
		// SqlSessionFactoryBuilder().build(reader);
		// if (dbManager == null)
		// System.out.println("build faild");
		// else
		// System.out.println("build");
		//
		// SqlSession conn = dbManager.openSession();
		//
		// if (conn == null)
		// System.out.println("conn faild");
		// else
		// System.out.println("conn");
		//
		// UserVO userVO = new UserVO();
		// userVO.setId("park");
		// userVO.setPw("333");
		// userVO.setName("박씨");
		// int res = conn.insert("userNameSpace.insertUser", userVO);
		// System.out.println(res + "rows insert");
		// conn.commit();
		//
		// ArrayList<UserVO> list = (ArrayList)
		// conn.selectList("userNameSpace.allUser");
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getSeq() + "\t");
		// System.out.println(list.get(i).getId() + "\t");
		// System.out.println(list.get(i).getName() + "\t");
		// System.out.println(list.get(i).getPw());
		// }
		// conn.delete(arg0, arg1)
		// conn.insert(arg0, arg1)
		// conn.update(arg0, arg1)
		// conn.selectList(arg0, arg1)
		// conn.selectOne(arg0, arg1)
		// conn.select(arg0, arg1, arg2, arg3)
		// conn.select(arg0, arg1, arg2, arg3)
		// UserVO vo = new UserVO();

		// vo.setId("lkh");
		// vo.setPw("0000");
		// vo = conn.selectOne("userNameSpace.login", vo);
		// System.out.println(vo.getSeq());

		// vo.setId("user2");
		// vo.setPw("999");
		// Integer res = conn.insert("userNameSpace.meminsert", vo);
		// conn.commit();
		// System.out.println("RES:" + res);
		//
		// vo.setPw("999");
		// vo.setId("lkh");
		// int ur = conn.update("userNameSpace.memUpdate", vo);
		// conn.commit();
		// System.out.println("upt건수" + ur);

		// vo.setSeq(3);
		// conn.delete("userNameSpace.memDelete", vo);
		// conn.commit();
		//
		// System.out.println("\n\n----------------------");
		// ArrayList<UserVO> list =
		// (ArrayList)conn.selectList("userNameSpace.allUser");
		// for(int i=0; i<list.size(); i++) {
		// vo = list.get(i);
		// System.out.println(vo.getId() + "," + vo.getSeq());
		// }
		//
		//// ArrayList list
		//// = (ArrayList)session.selectOne
		//// ("userNameSpace.login");
		//// System.out.println(list.size());
		//// session.close();
		// } catch(Exception e) {
		// e.printStackTrace();
		// }

		// session = sqlSessionFactory.openSession();
		// vo.setUserid("admin");
		// vo.setUserpw("1111");
		// list = (ArrayList) session.select("userNameSpace.login", vo);

		// public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"D:\\weekend\\spring\\git\\180623\\spring_di\\src\\main\\webapp\\WEB-INF\\servlet-context.xml");

		SqlSessionFactory dbManager = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
		if (dbManager == null)
			System.out.println("build faild");
		else
			System.out.println("build");

		SqlSession conn = dbManager.openSession();

		if (conn == null)
			System.out.println("conn faild");
		else
			System.out.println("conn");

		ArrayList<UserVO> list = (ArrayList) conn.selectList("userNameSpace.allUser");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSeq() + "\t");
			System.out.print(list.get(i).getId() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getPw() + "\t");
		}

		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		// UserDAO dao = (UserDAO) ctx.getBean("userDAO_bname");
		// UserVO vo = new UserVO();
		// vo.setId("lkh");
		// vo.setPw("111");
		// dao.getUser(vo);
		// System.out.println(vo.getName());

	}
}
