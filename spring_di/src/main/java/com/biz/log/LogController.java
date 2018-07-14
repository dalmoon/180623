package com.biz.log;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {
	@Autowired
	private LogService logService;

	@RequestMapping(value = "/log.do")
	public String logWrite(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Contrller logWrite....");
		String id = "kim";
		logService.logSvcWrite(id);// lseq id regdate
		return "login";
	}

	@RequestMapping(value = "/loglist.do")
	public ModelAndView logList(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Contrller logWrite....");
		LoginfoVO loginfoVO = new LoginfoVO();
		loginfoVO.setId("kim");
		loginfoVO.setRegdate("20180717");

		ArrayList<LoginfoVO> list = new ArrayList<LoginfoVO>();
		list = logService.logSvcList(loginfoVO);

		ModelAndView mav = new ModelAndView();
		mav.addObject("MAP_KEY_LOGLIST", list); // 객체
		mav.setViewName("loglist"); // jsp
		return mav;
	}
}
