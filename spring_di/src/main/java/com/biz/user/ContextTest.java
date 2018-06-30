package com.biz.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"D:\\weekend\\spring\\git\\180623\\spring_di\\src\\main\\webapp\\WEB-INF\\servlet-context.xml");
		UserDAO dao = (UserDAO) ctx.getBean("userDAO_bname");
		UserVO vo = new UserVO();
		vo.setId("lkh");
		vo.setPw("111");
		dao.getUser(vo);
		System.out.println(vo.getName());
	}
}
