package com.biz.log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestController {
	@Autowired
	private LogService logService;
	

	@RequestMapping(value="/jsonlist2.do", method=RequestMethod.POST)
	public List<LoginfoVO> jsonList(LoginfoVO loginfoVO){
		System.out.println("Controller jsonList");
		System.out.println("loginfoVO = " + loginfoVO);

		List<LoginfoVO> list = logService.logSvcList(loginfoVO);
		System.out.println("list.size() = " + list.size());

		return list;
	}
}
