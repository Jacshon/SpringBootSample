package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.UserDao;
import com.wwj.server.administration.domain.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<SysUser> userList() {
        return userDao.findAll();
    }

    @Override
    public SysUser findByUserName(String loginId) {
        return userDao.findByLoginId(loginId);
    }

    //    @Transactional
    @Override
    public SysUser userSave(SysUser sysUser) {
        return userDao.save(sysUser);
    }

    @Override
    public SysUser getUserDetails(String userId) {
        return userDao.getOne(userId);
    }

    @Override
    public void userDelete(String userId){
        userDao.delete(userId);
    }
}
