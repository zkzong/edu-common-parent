package com.zkzong.demo.user.base;

import com.zkzong.demo.user.entity.PmsUser;



public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
