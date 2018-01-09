package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.UserDao;
import com.wwj.server.administration.domain.User;
import com.wwj.server.common.exception.CustomerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
        user = userDao.save(user);
        if (1==1) {
            logger.error("Exception {} in {}.", "", "saveUser");
            throw new CustomerException(200, "Save user error!");
        }
        return user;
    }

    @Override
    public User getUserDetails(String userId) {
        User user = userDao.getOne(userId);
        if (user.getPassword().isEmpty())
            throw new CustomerException(99,"密码为空");
        if (user.getPassword().length() < 8)
            throw new CustomerException(100,"密码强度不够");
        return user;
    }


    @Override
    public void userDelete(String userId){
        userDao.delete(userId);
    }
}
