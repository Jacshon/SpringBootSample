package com.wwj.server.administration.controller;

import com.wwj.server.administration.dao.OperateDao;
import com.wwj.server.administration.domain.Operate;
import com.wwj.server.shared.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = URL.MODULE_OPERATE)
public class OperateController {

    @Autowired
    private OperateDao operateDao;

    @PostMapping(value = URL.SYS_OPERATE_SAVE)
    public Operate saveOperateController(@RequestBody Operate operate) {
        return operateDao.save(operate);
    }
}
