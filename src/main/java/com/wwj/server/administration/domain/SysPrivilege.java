package com.wwj.server.administration.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * 权限表是RBAC系统的核心
 */
@Entity(name = "sys_privilege")
public class SysPrivilege {
    @Id
    @Column(length = 32)
    private String privilegeId;

    @Column(name = "privilege_pid", length = 32)
    private String privilegePid;
    @Column(length = 64)
    private String privilegeName;

    // 用于操作按钮权限验证,actionValue是操作码值的和（此处已保证和唯一，利用二进制特性)
    // 如：查看和删除操作的码值分别1和8，根据对应的二进制码值0001和1000，给出actionValue=1001即9,
    // 匹配时，只需要用相应操作与actionveValue进行与运算即可，如果判断是否有编辑权限1001&0010=0000 = 0
    // 即没有编辑权限，判断是否有修改权限1001&1000=1000 > 0
    private int actionValue;

    // menuId用来控制URL访问权限
    @OneToOne
    private SysMenu sysMenu;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sys_privilege_group_asso"
            ,joinColumns = {@JoinColumn(name = "privilege_id")}
            ,inverseJoinColumns = {@JoinColumn(name = "privilege_group_id")})
    private Set<SysPrivilegeGroup> privilegeGroupSet;

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public int getActionValue() {
        return actionValue;
    }

    public void setActionValue(int actionValue) {
        this.actionValue = actionValue;
    }

    public String getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(String privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegePid() {
        return privilegePid;
    }

    public void setPrivilegePid(String privilegePid) {
        this.privilegePid = privilegePid;
    }

    public SysMenu getSysMenu() {
        return sysMenu;
    }

    public void setSysMenu(SysMenu sysMenu) {
        this.sysMenu = sysMenu;
    }

}
