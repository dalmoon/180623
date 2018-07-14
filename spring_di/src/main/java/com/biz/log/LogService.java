package com.biz.log;

import java.util.ArrayList;

public interface LogService {
	public void logSvcWrite(String id);
	public ArrayList<LoginfoVO> logSvcList(LoginfoVO loginfoVO);
}
