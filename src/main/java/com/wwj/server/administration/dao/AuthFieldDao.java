package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.AuthField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthFieldDao extends JpaRepository<AuthField, Integer> {
}
