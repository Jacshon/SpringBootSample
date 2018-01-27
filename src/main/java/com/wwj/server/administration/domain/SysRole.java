package com.wwj.server.administration.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sys_role")
public class SysRole {
    @Id
    @Column(length = 32)
    private String roleId;

    private String roleCode;

    private String roleName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sys_role_privilege"
            ,joinColumns = {@JoinColumn(name = "role_id")}
            ,inverseJoinColumns = {@JoinColumn(name = "privilege_id")})
    private List<SysPrivilege> sysPrivileges;

    public List<SysPrivilege> getSysPrivileges() {
        return sysPrivileges;
    }

    public void setSysPrivileges(List<SysPrivilege> sysPrivileges) {
        this.sysPrivileges = sysPrivileges;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
