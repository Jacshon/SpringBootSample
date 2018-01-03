package com.wwj.server.common.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handle(Exception e) {
        return e.getMessage();
    }
}
