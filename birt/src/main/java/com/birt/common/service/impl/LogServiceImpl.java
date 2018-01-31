package com.birt.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birt.common.dao.LogDao;
import com.birt.common.domain.LogDO;
import com.birt.common.domain.PageDO;
import com.birt.common.service.LogService;
import com.birt.common.utils.Query;

@SuppressWarnings("AlibabaRemoveCommentedCode")
@Service
public class LogServiceImpl implements LogService {
	@Autowired
	LogDao logMapper;

	@Override
	public PageDO<LogDO> queryList(Query query) {
		int total = logMapper.count(query);
		List<LogDO> logs = logMapper.list(query);
		PageDO<LogDO> page = new PageDO<>();
		page.setTotal(total);
		page.setRows(logs);
		return page;
	}

	@Override
	public int remove(Long id) {
		int count = logMapper.remove(id);
		return count;
	}

	@Override
	public int batchRemove(Long[] ids){
		return logMapper.batchRemove(ids);
	}
}
