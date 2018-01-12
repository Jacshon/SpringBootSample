package com.wwj.server.common.aspect;

import com.wwj.server.common.exception.CustomerException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
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
    public void controllerPointCut() {

    }

    @Around("controllerPointCut()")
    public void controllerException(ProceedingJoinPoint pjp) {
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
