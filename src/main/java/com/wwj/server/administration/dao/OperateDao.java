package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.Operate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface OperateDao extends JpaRepository<Operate, Integer> {
}