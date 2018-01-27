package com.wwj.server.administration.domain;

import javax.persistence.*;

@Entity
@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @Column(length = 32)
    private String menuId;
    @Column(length = 32)
    private String parentId;

    @Column(length = 30, unique = true)
    private String menuName;

    @Column(length = 60)
    private String menuUrl;

    @Column(length = 4)
    private String menuLevel;

    private Long createTime;

    private Long updateTime;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
