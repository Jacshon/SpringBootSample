package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.LoginLogDao;
import com.wwj.server.administration.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginLogServiceImpl implements LoginLogService {
    @Autowired
    private LoginLogDao loginLogDao;

    @Override
    public LoginLog saveLoginLog(LoginLog loginLog) {
        return loginLogDao.save(loginLog);
    }

    @Override
    public List<LoginLog> searchLoginLog() {
        return loginLogDao.findAll();
    }
}
