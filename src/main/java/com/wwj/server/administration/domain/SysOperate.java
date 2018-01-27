package com.wwj.server.administration.domain;

import javax.persistence.*;

@Entity
@Table(name = "sys_operate")
public class SysOperate {
    @Id
    @Column(length = 32)
    private String operateId;

    // 码值说明:查询=0001，修改=0010，删除=0100，新增=1000
    @Column(length = 4)
    private String operateCode;

    @Column(length = 30)
    private String operateName;

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId;
    }

    public String getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }
}
