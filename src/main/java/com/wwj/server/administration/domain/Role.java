package com.wwj.server.administration.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity(name = "sys_role")
@Component
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleId;

    @Column(length = 20)
    private String createBy;
    private long createTime;
    @Column(length = 20)
    private String updateBy;
    private long updateTime;

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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
