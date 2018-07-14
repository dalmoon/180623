package com.biz.log;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.user.UserService;

@Controller
public class LogController {
	@Autowired
	private LogService logService;

	@RequestMapping(value="/log.do")
	public String logWrite(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Contrller logWrite....");
		String id = "kim";
		logService.logSvcWrite(id);//lseq id regdate
		//return "loglist";  // prefix  / suffix .jsp
		return "redirect:/loglist.do";
	}
	
	
	@RequestMapping(value="/loglist.do")
	public ModelAndView logList(
			LoginfoVO loginfoVO
			//HttpServletRequest request, HttpServletResponse response
//			@RequestParam("searchgubun") String searchgubun,
//			@RequestParam(value="searchstr", required=false) String searchstr
			) {
		System.out.println("Contrller logList....");
//		LoginfoVO loginfoVO = new LoginfoVO();
//		String searchgubun = request.getParameter("searchgubun");
//		String searchstr = request.getParameter("searchstr");
//		
//		loginfoVO.setSearchgubun(searchgubun);
//		loginfoVO.setSearchstr(searchstr);
		
		//loginfoVO.setId("kim");
		//loginfoVO.setRegdate("20180714");
		
		ArrayList<LoginfoVO> list = new ArrayList<LoginfoVO>();
		list = logService.logSvcList(loginfoVO);
		System.out.println("-----" + list.size() + "건");
		ModelAndView mav = new ModelAndView();
		mav.addObject("MAP_KEY_LOGLIST", list); 	//객체
		mav.setViewName("loglist");  		//jsp
		return mav;
	}
	
	@RequestMapping(value="/jsonlist.do", method=RequestMethod.POST)
	public ResponseEntity<ArrayList<LoginfoVO>> jsonList(
			@RequestBody LoginfoVO loginfoVO
			) {
		System.out.println("Contrller logList...." + loginfoVO.getSearchgubun());
		
		ArrayList<LoginfoVO> list = new ArrayList<LoginfoVO>();
		list = logService.logSvcList(loginfoVO);
		System.out.println("-----" + list.size() + "건");
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("MAP_KEY_LOGLIST", list); 	//객체
//		mav.setViewName("loglist");  		//jsp
//		return mav;
		ResponseEntity<ArrayList<LoginfoVO>> re = new ResponseEntity<ArrayList<LoginfoVO>>(list, HttpStatus.OK);
		
		return re;
	}
	
}

