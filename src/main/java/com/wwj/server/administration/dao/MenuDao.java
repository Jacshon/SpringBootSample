package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MenuDao extends JpaRepository<SysMenu, Integer> {
}
