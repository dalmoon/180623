package com.biz.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.mapper.BoardMap;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardMap boardMap;
	
	public int boardInsert(BoardVO boardVO){
		return boardMap.binsert(boardVO);
	}
	public ArrayList<BoardVO> boardSelect(){
		return boardMap.select();
	}
	public int replyInsert(BoardReplyVO boardReplyVO) {
		return boardMap.rinsert(boardReplyVO);
	}

}
