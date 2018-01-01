package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.UserDao;
import com.wwj.server.administration.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> userList() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public void userSave(User user) {
        userDao.save(user);
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
