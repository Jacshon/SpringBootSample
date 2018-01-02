package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void userSave() {
        User user = new User();
        user.setUserId("1");
        user.setLoginId("wwj");
        user.setPassword("123456");
        user.setRealName("weijiang");
        user.setCreateTime(new Date());
        user.setLoginCount(1);
        userService.userSave(user);
    }
}