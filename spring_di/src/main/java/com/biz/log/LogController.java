package com.biz.log;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {
	@Autowired
	private LogService logService;
	
	@RequestMapping(value="/log.do")
	public String logWrite(){
		System.out.println("Controller logWrite");
		String id = "kim";
		logService.logSvcWrite(id);
		return "redirect:/loglist.do";
	}
	
	@RequestMapping(value="/loglist.do")
	public ModelAndView logList(
			//HttpServletRequest request
			@ModelAttribute LoginfoVO loginfoVO
			//@RequestParam(value = "searchGubun", required=false) String searchGubun,
			//@RequestParam("searchStr") String searchStr
			){
		System.out.println("Controller logList");
		System.out.println("loginfoVO = " + loginfoVO);
		//LoginfoVO loginfoVO = new LoginfoVO();
		
		//String searchGubun = request.getParameter("searchGubun");
		//String searchStr = request.getParameter("searchStr");
		
		/*loginfoVO.setId("kim");
		loginfoVO.setRegdate("20180714");*/
		//loginfoVO.setSearchGubun(searchGubun);
		//loginfoVO.setSearchStr(searchStr);
				
		List<LoginfoVO> list = logService.logSvcList(loginfoVO);
		System.out.println("list.size() = " + list.size());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("MAP_KEY_LOGLIST", list);
		mav.setViewName("loglist");
		
		return mav;
	}
	
	@RequestMapping(value="/jsonlist.do", method=RequestMethod.POST)
	public ResponseEntity<List<LoginfoVO>> jsonList(@RequestBody LoginfoVO loginfoVO){
		System.out.println("Controller jsonList");
		System.out.println("loginfoVO = " + loginfoVO);

		List<LoginfoVO> list = logService.logSvcList(loginfoVO);
		System.out.println("list.size() = " + list.size());

		ResponseEntity<List<LoginfoVO>> re = new ResponseEntity<List<LoginfoVO>>(list, HttpStatus.OK);
		return re;
	}
}
