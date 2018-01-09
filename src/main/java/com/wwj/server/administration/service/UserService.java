package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.LoginLog;
import com.wwj.server.administration.domain.Role;
import com.wwj.server.administration.domain.User;

import java.util.List;

public interface UserService {
    public List<User> userList();

    public void userSave(User user);

    public User getUserDetails(String userId) throws Exception;

    public void userDelete(String userId);


}
