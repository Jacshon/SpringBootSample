package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.LoginLog;

import java.util.List;

public interface LoginLogService {

    public LoginLog saveLoginLog(LoginLog loginLog);
    public List<LoginLog> searchLoginLog();

}
