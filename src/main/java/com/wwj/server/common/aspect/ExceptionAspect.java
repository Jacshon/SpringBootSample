package com.wwj.server.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Author: WWJ
 * Date: 2018/1/9 15:49
 */
@Aspect
@Component
public class ExceptionAspect {

    private Logger logger = LoggerFactory.getLogger(ExceptionAspect.class);

    @Pointcut("execution(public * com.wwj.server.*.service.*.*(..))")
    public void servicePointCut() {

    }

    @Around("servicePointCut()")
    public Object controllerException(ProceedingJoinPoint pjp) {
        Object object = null;
        try {
            object = pjp.proceed();
        } catch (Throwable e) {
            logger.info("Error in {}", e.getStackTrace());
        }
        return object;
    }
}
