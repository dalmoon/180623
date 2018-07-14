package com.biz.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import com.biz.board.BoardReplyVO;
import com.biz.board.BoardVO;

@Repository(value="boardMap")
public interface BoardMap {
	public int binsert(BoardVO boardVO);
	
	public ArrayList<BoardVO> select();
	
	public int rinsert(BoardReplyVO boardReplyVO);
	
}
