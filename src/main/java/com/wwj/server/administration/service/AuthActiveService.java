package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.AuthActive;

import java.util.List;

public interface AuthActiveService {
    public List<AuthActive> findAll();

    public AuthActive saveAuthActive(AuthActive authActive);

    public AuthActive searchDetails(Integer id);

    public void deleteAuthActive(Integer id);
}
