package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.SysMenu;

import java.util.List;

public interface MenuService {
    public SysMenu getMenuById(Integer menuId);

    public List<SysMenu> getAllMenus();

    public List<SysMenu> getMenusByModel(SysMenu sysMenu);

    public SysMenu saveMenu(SysMenu sysMenu);

    public void batchSaveMenus(List<SysMenu> sysMenus);

    public void deleteMenuById(Integer menuId);
}
