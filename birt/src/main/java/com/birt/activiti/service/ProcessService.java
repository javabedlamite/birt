package com.birt.activiti.service;

import java.io.InputStream;

import org.activiti.engine.repository.Model;
import org.springframework.stereotype.Service;

/**

 */
@Service
public interface ProcessService {
    Model convertToModel(String procDefId) throws Exception;

    InputStream resourceRead(String id, String resType) throws Exception;
}
