package com.wwj.server.common.handler;

import com.wwj.server.common.domain.Response;
import com.wwj.server.common.exception.CustomerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {

    private static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response handle(Exception e) {
        if (e instanceof CustomerException) {
            CustomerException ce = (CustomerException) e;
            return Response.error(ce.getCode(), ce.getMessage());
        } else {
            logger.error("Systerm Error {}", e);
            return Response.error(-1,"Unknow Error");
        }
    }
}
