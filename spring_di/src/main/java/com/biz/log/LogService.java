package com.biz.log;

import java.util.List;

public interface LogService {
	public void logSvcWrite(String id);
	public List<LoginfoVO> logSvcList(LoginfoVO loginfoVO);
}
