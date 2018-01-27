package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.SysUser;

import java.util.List;

public interface UserService {
    public List<SysUser> userList();

    public SysUser userSave(SysUser sysUser);

    public SysUser getUserDetails(String userId) ;

    public void userDelete(String userId);


}
