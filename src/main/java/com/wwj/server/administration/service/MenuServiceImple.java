package com.wwj.server.administration.service;

import com.wwj.server.administration.dao.MenuDao;
import com.wwj.server.administration.domain.SysMenu;
import com.wwj.server.shared.util.UUIDTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MenuServiceImple implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public SysMenu getMenuById(Integer menuId) {
        return menuDao.findOne(menuId);
    }

    @Override
    public List<SysMenu> getAllMenus() {
        return menuDao.findAll();
    }

    @Override
    public List<SysMenu> getMenusByModel(SysMenu sysMenu) {
        return null;
    }

    @Transactional
    @Override
    public SysMenu saveMenu(SysMenu sysMenu) {
        sysMenu.setMenuId(UUIDTool.getUUID());
        return menuDao.saveAndFlush(sysMenu);
    }

    @Transactional
    @Override
    public void batchSaveMenus(List<SysMenu> sysMenus) {
    }

    @Override
    public void deleteMenuById(Integer menuId) {
        menuDao.delete(menuId);
    }
}
