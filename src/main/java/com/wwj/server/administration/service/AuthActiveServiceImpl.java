package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.AuthActiveDao;
import com.wwj.server.administration.domain.AuthActive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthActiveServiceImpl implements AuthActiveService {

    @Autowired
    private AuthActiveDao authActiveDao;

    @Override
    public List<AuthActive> findAll() {
        return authActiveDao.findAll();
    }

    @Override
    public AuthActive saveAuthActive(AuthActive authActive) {
        return authActiveDao.save(authActive);
    }

    @Override
    public AuthActive searchDetails(Integer id) {
        return authActiveDao.findOne(id);
    }

    @Override
    public void deleteAuthActive(Integer id) {
        authActiveDao.delete(id);
    }
}
