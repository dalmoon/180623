package com.biz.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.biz.log.LoginfoVO;

@Repository
public interface LogMap {
	public void insert(String id);

	public ArrayList<LoginfoVO> select(LoginfoVO loginfoVO);
}
