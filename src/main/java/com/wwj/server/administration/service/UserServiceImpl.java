package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.UserDao;
import com.wwj.server.administration.domain.User;
import com.wwj.server.common.exception.ControllerException;
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

//    @Transactional
    @Override
    public void userSave(User user) {
        userDao.save(user);
        throw new NullPointerException("Error exception test!");
    }

    @Override
    public User getUserDetails(String userId) {
        User user = userDao.getOne(userId);
        if (user.getPassword().isEmpty())
            throw new ControllerException(99,"密码为空");
        if (user.getPassword().length() < 8)
            throw new ControllerException(100,"密码强度不够");
        return user;
    }


    @Override
    public void userDelete(String userId){
        userDao.delete(userId);
    }
}
