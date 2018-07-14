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
		//----------------------------------------
		//Mybatis session build
		//----------------------------------------
//		String path2 = "config-mybatis.xml";
//		Reader reader; 
//		try {
//			reader = Resources.getResourceAsReader(path2);
//			SqlSessionFactory dbManager  
//			= new SqlSessionFactoryBuilder().build(reader);
//			if(dbManager == null)
//				System.out.println("build faild");
//			else
//				System.out.println("build");
//
//			SqlSession conn = dbManager.openSession();
//			if(conn == null)
//				System.out.println("conn faild");
//			else
//				System.out.println("conn");
//			
//			
////			create sequence mvcuser_seq
////			start with 1
////			increment by 1;
//			
//			//-------------------------------
//			//conn.delete(arg0, arg1)
//			//conn.insert(arg0, arg1)
//			//conn.update(arg0, arg1)
//			//conn.selectList(arg0, arg1)
//			//conn.selectOne(arg0, arg1)
//			//conn.select(arg0, arg1, arg2, arg3)
//			//conn.select(arg0, arg1, arg2, arg3)
//			//-------------------------------
//			
//			UserVO userVO = new UserVO();
//			//-------------------------------
//			userVO.setId("park");
//			userVO.setPw("333");
//			userVO.setName("박씨");
//			int res = conn.insert("userNameSpace.insertUser", userVO);
//			System.out.println(res + "rows insert");
//			conn.commit();
//			//-------------------------------
//			ArrayList<UserVO> list 
//				= (ArrayList)conn.selectList("userNameSpace.allUser");
//			for(int i=0; i<list.size(); i++) {
//				System.out.print(list.get(i).getSeq()+"\t");
//				System.out.print(list.get(i).getId()+"\t");
//				System.out.print(list.get(i).getPw()+"\t");
//				System.out.println(list.get(i).getName());
//			}
//			
//			//-------------------------------
////			userVO.setId("lkh");
////			userVO.setPw("0000"); 
////			vo = conn.selectOne("userNameSpace.login", vo);
////			System.out.println(userVO.getSeq());
////
////			userVO.setId("user2");
////			userVO.setPw("999");
////			Integer res = conn.insert("userNameSpace.meminsert", vo);
////			conn.commit();
////			System.out.println("RES:" + res);
//
////			userVO.setPw("999");
////			userVO.setId("lkh");
////			int ur = conn.update("userNameSpace.memUpdate", vo);
////			conn.commit();
////			System.out.println("upt건수" + ur);
////
////			userVO.setSeq(3);
////			conn.delete("userNameSpace.memDelete", vo);
////			conn.commit();

		
		//----------------------------------------
		//Spring session build
		//----------------------------------------
			ApplicationContext ctx 
			= new FileSystemXmlApplicationContext
			("D:\\weekend\\spring\\workspace\\spring_di\\src\\main\\webapp\\WEB-INF\\servlet-context.xml");
			
			SqlSessionFactory dbManager = (SqlSessionFactory)ctx.getBean("sqlSessionFactory");
			if(dbManager == null)
				System.out.println("build faild");
			else
				System.out.println("build");

			SqlSession conn = dbManager.openSession();
			if(conn == null)
				System.out.println("conn faild");
			else
				System.out.println("conn");
			
			
			ArrayList<UserVO> list 
				= (ArrayList)conn.selectList("userNameSpace.allUser");
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i).getSeq()+"\t");
				System.out.print(list.get(i).getId()+"\t");
				System.out.print(list.get(i).getPw()+"\t");
				System.out.println(list.get(i).getName());
			}
			
			
//			UserDAO dao = (UserDAO)ctx.getBean("userDAO_bname");
//			UserVO vo = new UserVO();
//			userVO.setId("lkh");
//			userVO.setPw("111");
//			vo = dao.getUser(vo);
//			System.out.println(userVO.getName());

			
				
	}

}
