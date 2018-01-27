package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.SysOperate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface OperateDao extends JpaRepository<SysOperate, Integer> {
}
