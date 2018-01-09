package com.wwj.server.common.aspect;

import com.wwj.server.common.exception.ControllerException;
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
public class TryCatchAspect {

    private Logger logger = LoggerFactory.getLogger(TryCatchAspect.class);

    @Pointcut("execution(public * com.wwj.server.*.controller.*.*(..))")
    public void controllerPointCut() {

    }

    @Around("controllerPointCut()")
    public void controllerTryCatch(ProceedingJoinPoint pjp) {
        Signature signature = pjp.getSignature();
        try {
            pjp.proceed();
        } catch (Throwable e) {
            if (e instanceof ControllerException) {
                logger.error(signature.toString());
                throw new ControllerException(1,"Controller layer Error");
            } else if(e instanceof RuntimeException) {

            } else {

            }
        }
    }

}
