package com.wwj.server.administration.controller;

import com.wwj.server.administration.domain.User;
import com.wwj.server.administration.service.UserService;
import com.wwj.server.shared.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = URL.MODULE_USER)
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = URL.USER_SEARCH, method = RequestMethod.GET)
    public List<User> userlist() {
        return userService.userList();
    }

    @RequestMapping(value = URL.USER_SAVE, method = RequestMethod.POST)
    public User userSave(@RequestBody User user) {
        return userService.userSave(user);
    }

    @PostMapping(value = URL.USER_DETAIL)
    public void userDetail(@PathVariable("userId") String userId) throws Exception{
        userService.getUserDetails(userId);
    }

}
