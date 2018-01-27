package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.SysLoginLog;

import java.util.List;

public interface LoginLogService {

    public SysLoginLog saveLoginLog(SysLoginLog sysLoginLog);
    public List<SysLoginLog> searchLoginLog();

}
