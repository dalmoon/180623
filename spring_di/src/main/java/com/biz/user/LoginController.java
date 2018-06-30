package com.biz.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class LoginController {//extends MultiActionController {//implements Controller {
	@Autowired
	private UserService userService;
//	public LoginController(UserService svc) {
//		this.userService = svc;
//	}
	
//	public void setUserServiceFunc(UserService svc){
//		this.userService = svc;
//	}
	@RequestMapping(value = "/logout.do")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Contrller logout.....");
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}
	
	@RequestMapping(value = "/login.do")
	//public String login(HttpServletRequest request) {
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) { //throws Exception{
		System.out.println("Contrller login....");
		ModelAndView mav = new ModelAndView();

//		String key = request.getParameter("key");
//		if(key.equals("login.do")) {
//		}else if(key.equals("login.do")) {
//		}
		//1. 사용자 입력정보(id,pw) 추출 코드
		UserVO vo = new UserVO(); 
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		
		//2. 사용자 입력 정보 이용 UserVO 객체 조회
		//setter()로 UserService객체 못 받아올 경우 아래 주석풀고 실행
		//UserService userService = new UserServiceImpl();
		vo = userService.getUser(vo);
		
		//3. DB 연동 로직 구현(USERDAO 객체 사용)
		String viewName="";
		if(!vo.getName().equals("")) {
			HttpSession session = request.getSession();
			session.setAttribute("SESS_ID", vo.getId());
			session.setAttribute("SESS_NAME", vo.getName());
			//viewName = "main";
			mav.setViewName("main");
		} else {
			//viewName = "login";
			mav.setViewName("login");
		} 
		//return viewName;
		return mav;
	}
}
