package com.wwj.server.administration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "sys_privilege_group")
public class SysPrivilegeGroup {

    @Id
    @Column(length = 32)
    private String privilegeGroupId;
    @Column(length = 64)
    private String name;
    @Column(length = 4)
    private String type;
    @Column(length = 32)
    private String code;
    private int priority;
    @Column(length = 2)
    private String status;
    private Long createTime;
    private Long updateTime;

    public String getPrivilegeGroupId() {
        return privilegeGroupId;
    }

    public void setPrivilegeGroupId(String privilegeGroupId) {
        this.privilegeGroupId = privilegeGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
