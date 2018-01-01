package com.wwj.server.administration.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity(name = "sys_auth_field")
public class AuthField {
    @Id
    @Column(length = 20)
    private String filedCode;
    @Column(length = 100)
    private String description;

    private long createdTime;
    @Column(length = 20)
    private String createBy;
    private long updateTime;
    @Column(length = 20)
    private String updateBy;

    private boolean status;

    public String getFiledCode() {
        return filedCode;
    }

    public void setFiledCode(String filedCode) {
        this.filedCode = filedCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
