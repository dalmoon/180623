package com.biz.mapper;

import org.springframework.stereotype.Repository;
import com.biz.user.UserVO;

@Repository(value="userMap")
public interface UserMap {
	public UserVO getUser(UserVO vo);
	

}
