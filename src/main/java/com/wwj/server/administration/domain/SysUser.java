package com.wwj.server.administration.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "sys_user")
public class SysUser {
    @Id
    @Column(name = "user_id",length = 32)
    private String userId;
    @Column(length = 50)
    private String loginId;
    @Column(length = 60)
    private String password;
    @Column(length = 50)
    private String realName;
    @Column(length = 13)
    private String mobile;
    @Column(length = 50)
    private String email;
    private Date lastLoginTime;
    private int loginCount;
    private Date createTime;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sys_user_role"
            ,joinColumns = {@JoinColumn(name = "user_id")}
            ,inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<SysRole> sysRoles;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Set<SysRole> getSysRoles() {
        return sysRoles;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.loginId;
    }

}
