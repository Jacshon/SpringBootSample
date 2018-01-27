package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void userSave() {
        SysUser sysUser = new SysUser();
        sysUser.setUserId("1");
        sysUser.setLoginId("wwj");
        sysUser.setPassword("123456");
        sysUser.setRealName("weijiang");
        sysUser.setCreateTime(new Date());
        sysUser.setLoginCount(1);
        userService.userSave(sysUser);
    }
}