package com.wwj.server.administration.controller;

import com.wwj.server.administration.domain.User;
import com.wwj.server.administration.service.UserService;
import com.wwj.server.common.domain.Response;
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

    @RequestMapping(value = URL.USER_SEARCH, method = RequestMethod.POST)
    public Response userlist() {
        return Response.ok(userService.userList());
    }

    @RequestMapping(value = URL.USER_SAVE, method = RequestMethod.POST)
    public Response userSave(@RequestBody User user) {
        return Response.ok(userService.userSave(user));
    }

    @PostMapping(value = URL.USER_DETAIL)
    public Response userDetail(@PathVariable("userId") String userId) throws Exception{
        return Response.ok(userService.getUserDetails(userId));
    }

}
