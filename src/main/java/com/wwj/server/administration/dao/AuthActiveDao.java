package com.wwj.server.administration.dao;

import com.wwj.server.administration.domain.AuthActive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthActiveDao extends JpaRepository<AuthActive, Integer> {
}
