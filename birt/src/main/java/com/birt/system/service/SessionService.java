package com.birt.system.service;

import java.util.Collection;
import java.util.List;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import com.birt.system.domain.UserDO;
import com.birt.system.domain.UserOnline;

@Service
public interface SessionService {
	List<UserOnline> list();

	List<UserDO> listOnlineUser();

	Collection<Session> sessionList();
	
	boolean forceLogout(String sessionId);
}
