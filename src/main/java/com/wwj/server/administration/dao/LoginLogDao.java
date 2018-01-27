package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.SysLoginLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LoginLogDao extends JpaRepository<SysLoginLog, Integer> {
}
