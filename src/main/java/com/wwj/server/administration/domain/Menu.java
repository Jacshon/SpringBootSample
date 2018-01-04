package com.wwj.server.administration.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuId;

    @Column(length = 8, unique = true)
    private String code;

    @Column(length = 20)
    private String createBy;

    @Column
    private Timestamp createDate;

    @Column(length = 20)
    private String updateBy;

    @Column
    private Timestamp updateDate;

    @Column
    private boolean status;
}
