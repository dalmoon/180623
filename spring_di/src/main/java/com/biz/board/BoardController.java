package com.biz.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
//import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.servlet.mvc.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.user.UserService;

@Controller
public class BoardController { //extends MultiActionController { //implements Controller {
	@Autowired
	private UserService userService;
	//
	create table board(
			bseq number primary key,
			btitle varchar2(100),
			id varchar2(20),
			regdate date default sysdate
			);
   create sequence board_seq
   start with 1 increment by 1;
   
	insert into board values
	(board_seq.nextval,  '제목1', 'kim', sysdate);
	insert into board values
	(board_seq.nextval, '제목2', 'lee', sysdate);
	commit;
	
	
//   create table board_reply(
//			rseq number primary key,
//			bseq number,
//			reply varchar2(100)
//			);
//  create sequence board_reply_seq
//  start with 1 increment by 1;
   
//	insert into board_reply values
//	(board_reply_seq.nextval, 1, '댓글1');
//	insert into board_reply values
//	(board_reply_seq.nextval, 1, '댓글2');
//	commit;
//	
//	select b.bseq, b.btitle, b.id, 
//			r.rseq, r.reply
//	from board b, board_reply r
//	where b.bseq = r.bseq;
	
	//-------------------------------------------
   //public int boardInsert(BoardVO boardVO);
   //public ArrayList<BoardVO> boardSelect();
   //public int replyInsert(BoardVO boardVO);
   
	@RequestMapping(value = "/bform.do")
	public ModelAndView boardForm(HttpServletRequest request, HttpServletResponse response) { //throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("baord/board_form");
		return mav;
	}
	@RequestMapping(value="/blist.do")
	public ModelAndView boardList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/board_list");
		return mav;
	}
	
	@RequestMapping(value = "/binsert.do")
	public String boardInsert(HttpServletRequest request, HttpServletResponse response) { //throws Exception {
		return "redirect:/blist.do";
	}

	@RequestMapping(value = "/rinsert.do")
	public String boardReplyInsert(HttpServletRequest request, HttpServletResponse response) { //throws Exception {
		return "redirect:/blist.do";
	}
	
}
