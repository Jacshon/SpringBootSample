package com.wwj.server.administration.controller;

import com.wwj.server.administration.domain.User;
import com.wwj.server.administration.service.UserService;
import com.wwj.server.shared.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = URL.MODULE_SYSTEM)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = URL.SYSTEM_USER_SEARCH, method = RequestMethod.GET)
    public List<User> userlist() {
        return userService.userList();
    }

    @RequestMapping(value = URL.SYSTEM_USER_SAVE, method = RequestMethod.POST)
    public void userSave(@RequestBody User user) {
        userService.userSave(user);
    }

    @RequestMapping(value = URL.SYSTEM_USER_DETAIL, method = RequestMethod.POST)
    public void userDetail(@RequestBody String userId) {
        userService.getUserDetails(userId);
    }

    @RequestMapping(value = URL.SYSTEM_USER_DETAIL, method = RequestMethod.DELETE)
    public void userDelete(String userId) {
        userService.userDelete(userId);
    }
}
