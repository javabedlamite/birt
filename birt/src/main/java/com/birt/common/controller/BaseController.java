package com.birt.common.controller;

import org.springframework.stereotype.Controller;

import com.birt.common.utils.ShiroUtils;
import com.birt.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}