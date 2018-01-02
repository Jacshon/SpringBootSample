package com.wwj.server.administration.controller;

import com.wwj.server.administration.domain.AuthActive;
import com.wwj.server.administration.service.AuthActiveService;
import com.wwj.server.shared.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = URL.MODULE_AUTH_ACTIVE)
public class AuthActiveController {

    @Autowired
    private AuthActiveService authActiveService;

    @GetMapping(value = URL.AUTH_ACTIVE_SEARCH)
    public List<AuthActive> searchAuthActives() {
        return authActiveService.findAll();
    }

    @PostMapping(value = URL.AUTH_ACTIVE_SAVE)
    public AuthActive saveAuthActive(@RequestBody AuthActive authActive) {
        return authActiveService.saveAuthActive(authActive);
    }

}
