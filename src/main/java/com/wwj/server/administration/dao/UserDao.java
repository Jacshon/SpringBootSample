package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserDao extends JpaRepository<SysUser, String> {
}
