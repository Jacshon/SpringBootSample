package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PrivilegeDao extends JpaRepository<Privilege,Integer> {
}
