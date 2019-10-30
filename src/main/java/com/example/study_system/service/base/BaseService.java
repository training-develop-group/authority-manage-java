package com.example.study_system.service.base;

import com.example.study_system.dao.JUserTaskInfoMapper;
import com.example.study_system.dao.TaskInfoMapper;
import com.example.study_system.dao.UserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * author lindan.
 * date 2019/10/10.
 */
public class BaseService {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected JUserTaskInfoMapper jUserTaskInfoMapper;
    @Autowired
    protected UserInfoMapper userInfoMapper;
    @Autowired
    protected TaskInfoMapper taskInfoMapper;
}
