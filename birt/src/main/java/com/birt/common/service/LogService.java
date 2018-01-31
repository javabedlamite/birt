package com.birt.common.service;

import org.springframework.stereotype.Service;

import com.birt.common.domain.LogDO;
import com.birt.common.domain.PageDO;
import com.birt.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
