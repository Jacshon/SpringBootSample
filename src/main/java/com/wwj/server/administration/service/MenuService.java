package com.wwj.server.administration.service;

import com.wwj.server.administration.domain.Menu;

import java.util.List;

public interface MenuService {
    public Menu getMenuById(Integer menuId);

    public List<Menu> getAllMenus();

    public List<Menu> getMenusByModel(Menu menu);

    public Menu saveMenu(Menu menu);

    public void batchSaveMenus(List<Menu> menus);

    public void deleteMenuById(Integer menuId);
}
