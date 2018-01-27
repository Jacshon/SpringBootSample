package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.LoginLogDao;
import com.wwj.server.administration.domain.SysLoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Autowired
    private LoginLogDao loginLogDao;

    @Override
    public SysLoginLog saveLoginLog(SysLoginLog sysLoginLog) {
        return loginLogDao.save(sysLoginLog);
    }

    @Override
    public List<SysLoginLog> searchLoginLog() {
        return loginLogDao.findAll();
    }
}
