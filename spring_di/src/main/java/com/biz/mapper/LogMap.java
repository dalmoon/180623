package com.biz.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.biz.log.LoginfoVO;

@Repository
public interface LogMap {
	public void insert(String id);
	public List<LoginfoVO> select(LoginfoVO loginfoVO);
}
