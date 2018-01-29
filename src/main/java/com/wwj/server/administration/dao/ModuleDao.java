package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.SysModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ModuleDao extends JpaRepository<SysModule,String> {
}
