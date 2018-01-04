package com.wwj.server.administration.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sys_operate")
public class Operate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer operateId;

    @Column(length = 4)
    private String code;

    @Column(length = 20)
    private String value;

    @Column(length = 50)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Date createDate;

    @Column
    @org.hibernate.annotations.UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    public Integer getOperateId() {
        return operateId;
    }

    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
