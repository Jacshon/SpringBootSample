package com.wwj.server.administration.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Component
@Entity(name = "sys_privilege")
public class Privilege {
    @Id
    private Integer privilegeId;
    @OneToOne
    private AuthObject authObject;
    @OneToOne
    private AuthField authField;
    @OneToOne
    private AuthActive authActive;
    @Column(length = 20)
    private String createBy;
    private long createTime;
    @Column(length = 20)
    private String updateBy;
    private long updateTime;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public AuthObject getAuthObject() {
        return authObject;
    }

    public void setAuthObject(AuthObject authObject) {
        this.authObject = authObject;
    }

    public AuthField getAuthField() {
        return authField;
    }

    public void setAuthField(AuthField authField) {
        this.authField = authField;
    }

    public AuthActive getAuthActive() {
        return authActive;
    }

    public void setAuthActive(AuthActive authActive) {
        this.authActive = authActive;
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
