package com.zkzong.web.boss.base;

import com.zkzong.facade.user.entity.PmsUser;

public interface UserLoginedAware {

	/**
	 * 取得登录的用户
	 * 
	 * @return
	 */
	public PmsUser getLoginedUser();
}
