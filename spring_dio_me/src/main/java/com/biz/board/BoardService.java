package com.biz.board;

import java.util.ArrayList;

public interface BoardService {
	public int boardInsert(BoardVO boardVO);
	public ArrayList<BoardVO> boardSelect();
	public int replyInsert(BoardReplyVO boardReplyVO);
}
