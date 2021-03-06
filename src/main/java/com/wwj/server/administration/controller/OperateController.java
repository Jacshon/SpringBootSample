package com.wwj.server.administration.controller;

import com.wwj.server.administration.dao.OperateDao;
import com.wwj.server.administration.domain.SysOperate;
import com.wwj.server.shared.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = URL.MODULE_SYS_OPERATE)
public class OperateController {

    @Autowired
    private OperateDao operateDao;

    @PostMapping(value = URL.SYS_OPERATE_SAVE)
    public SysOperate saveOperateController(@RequestBody SysOperate sysOperate) {
        return operateDao.save(sysOperate);
    }
}
