package com.wwj.server.common.controller;

import com.wwj.server.common.domain.Response;
import com.wwj.server.common.util.LocaleUtil;
import com.wwj.server.shared.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * Author: WWJ
 * Date: 2018/1/16 14:14
 */
@RestController
@RequestMapping(value = URL.MODULE_COMMON)
public class LocalChangeController implements Serializable {
    private static final long serialVersionUID = -5232886907019716075L;
    private Logger logger = LoggerFactory.getLogger(LocalChangeController.class);
    @GetMapping(value = URL.CHANGE_LOCALE)
	public Response changeLocale() throws Exception {
  		LocaleUtil.getLocal();
		logger.info("convertValues");
    	return new Response();
	}
}