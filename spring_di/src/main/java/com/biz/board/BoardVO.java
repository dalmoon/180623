package com.biz.board;

import java.util.ArrayList;

public class BoardVO {
	private int bseq;
	private String btitle;
	private String id; 
	private String regdate;
	
	//----------------------------------
	private ArrayList<BoardReplyVO> boardReplyVOList;
	public ArrayList<BoardReplyVO> getBoardReplyVOList() {
		return boardReplyVOList;
	}
	public void setBoardReplyVOList(ArrayList<BoardReplyVO> boardReplyVOList) {
		this.boardReplyVOList = boardReplyVOList;
	}
	//----------------------------------
	
	
	
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
