package com.wwj.server.administration.controller;

import com.wwj.server.administration.service.RoleService;
import com.wwj.server.common.domain.Response;
import com.wwj.server.shared.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URL.MODULE_SYS_ROLE)
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping(URL.SYS_ROLE_SEARCH)
    public Response roleList() {
        return new Response().ok(roleService.roleList());
    }
}
