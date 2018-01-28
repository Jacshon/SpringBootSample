package com.wwj.server.administration.domain;

import javax.persistence.*;

@Entity
@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @Column(length = 32)
    private String menuId;

    @Column(length = 30, unique = true)
    private String menuName;

    @Column(length = 60)
    private String state;

    @Column(length = 40)
    private String icon;

    @Column(length = 2)
    private String status;

    @OneToOne
    private SysModule sysModule;

    private Long createTime;

    private Long updateTime;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public SysModule getSysModule() {
        return sysModule;
    }

    public void setSysModule(SysModule sysModule) {
        this.sysModule = sysModule;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
