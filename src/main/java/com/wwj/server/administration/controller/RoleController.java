package com.wwj.server.administration.controller;

import com.wwj.server.administration.domain.Role;
import com.wwj.server.administration.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/roleList", method = RequestMethod.GET)
    public List<Role> roleList() {
        List<Role> roles = roleService.roleList();
        return roles;
    }
}
