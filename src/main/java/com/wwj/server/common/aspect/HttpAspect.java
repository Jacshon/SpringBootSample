package com.wwj.server.common.aspect;

import com.wwj.server.administration.dao.LoginLogDao;
import com.wwj.server.administration.domain.LoginLog;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {
    Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    LoginLogDao loginLogDao;

    @Pointcut("execution(public * com.wwj.server.*.controller.*.*(..))")
    public void log(){

    }

    @Before(value = "log()")
    public void before(){
        ServletRequestAttributes  attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("before");
        LoginLog loginLog = new LoginLog();
        loginLog.setLoginId("test");
        loginLog.setLoginTime(System.currentTimeMillis());
        loginLog.setLoginIp(request.getRemoteAddr());
        loginLog.setLoginType("pc");
        loginLogDao.save(loginLog);
    }

    @After(value = "log()")
    public void after() {
        logger.info("after");
    }

    @AfterReturning(value = "log()", returning = "object")
    public void afterReturing(Object object) {
        logger.info(object.toString());
    }
}