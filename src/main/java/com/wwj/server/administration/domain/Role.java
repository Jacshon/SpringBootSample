package com.wwj.server.administration.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sys_role")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleId;

    private String roleCode;

    private String roleName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sys_role_privilege"
            ,joinColumns = {@JoinColumn(name = "role_id")}
            ,inverseJoinColumns = {@JoinColumn(name = "privilege_id")})
    private List<Privilege> privileges;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
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
}
