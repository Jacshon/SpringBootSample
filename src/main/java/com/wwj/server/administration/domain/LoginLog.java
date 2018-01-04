package com.wwj.server.administration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "sys_login_log")
public class LoginLog {
    @Id
    @GeneratedValue
    private Integer loginLogId;
    @Column(length = 32)
    private String loginId;
    private Long loginTime;
    @Column(length = 15)
    private String loginIp;
    private Long logoutTime;
    @Column(length = 4)
    private String loginType;

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
