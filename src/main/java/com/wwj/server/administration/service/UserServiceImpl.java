package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.UserDao;
import com.wwj.server.administration.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> userList() {
        return userDao.findAll();
    }

//    @Transactional
    @Override
    public User userSave(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserDetails(String userId) {
        return userDao.getOne(userId);
    }

    @Override
    public void userDelete(String userId){
        userDao.delete(userId);
    }
}
