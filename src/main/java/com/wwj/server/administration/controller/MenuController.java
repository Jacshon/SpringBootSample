package com.wwj.server.administration.controller;

import com.wwj.server.administration.domain.SysMenu;
import com.wwj.server.administration.service.MenuService;
import com.wwj.server.common.domain.Response;
import com.wwj.server.shared.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(URL.MODULE_SYS_MENU)
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping(URL.SYS_MENU_SEARCH_ALL)
    public Response searchAllMenus() {
        return new Response().ok(menuService.getAllMenus());
    }

    @PostMapping(URL.SYS_MENU_SAVE)
    public Response saveMenu(@RequestBody SysMenu sysMenu) {
        return new Response().ok(menuService.saveMenu(sysMenu));
    }

    @PostMapping(URL.SYS_MENU_DELETE)
    public Response deleteMenu(@PathVariable Integer menuId) {
        menuService.deleteMenuById(menuId);
        return new Response().ok();
    }

    @GetMapping(URL.SYS_MENU_DETAILS)
    public Response getMenuDetails(@PathVariable Integer menuId) {
        return new Response().ok(menuService.getMenuById(menuId));
    }
}
