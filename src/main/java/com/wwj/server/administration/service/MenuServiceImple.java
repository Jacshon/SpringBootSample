package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.MenuDao;
import com.wwj.server.administration.domain.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MenuServiceImple implements MenuService {
    private static Logger logger = LoggerFactory.getLogger(MenuServiceImple.class);

    @Autowired
    private MenuDao menuDao;

    @Override
    public Menu getMenuById(Integer menuId) {
        return menuDao.findOne(menuId);
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuDao.findAll();
    }

    @Override
    public List<Menu> getMenusByModel(Menu menu) {
        return null;
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return menuDao.saveAndFlush(menu);
    }

    @Transactional
    @Override
    public void batchSaveMenus(List<Menu> menus) {
    }

    @Override
    public void deleteMenuById(Integer menuId) {
        menuDao.delete(menuId);
    }
}