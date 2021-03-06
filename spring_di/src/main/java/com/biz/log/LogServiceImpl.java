package com.biz.log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.mapper.LogMap;

@Service
public class LogServiceImpl implements LogService{
	@Autowired
	private LogMap logMap;

	@Override
	public void logSvcWrite(String id) {
		logMap.insert(id);
	}

	@Override
	public List<LoginfoVO> logSvcList(LoginfoVO loginfoVO) {
		return logMap.select(loginfoVO);
	}

}
