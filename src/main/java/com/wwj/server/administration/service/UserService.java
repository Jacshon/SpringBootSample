package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.User;

import java.util.List;

public interface UserService {
    public List<User> userList();

    public User userSave(User user);

    public User getUserDetails(String userId) ;

    public void userDelete(String userId);


}
