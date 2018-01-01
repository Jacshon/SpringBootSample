package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface RoleDao extends JpaRepository<Role,Integer>{
}
