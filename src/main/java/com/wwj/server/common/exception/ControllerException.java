package com.wwj.server.common.exception;

/**
 * 注意此处异常继承的类是RuntimeException而不是Exception
 * Spring只会回滚RuntimeException异常的操作
 *
 * Author: WWJ
 * Date: 2018/1/9 10:50
 */
public class ControllerException extends RuntimeException{

    private Integer code;

    private String massge;

    public ControllerException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMassge() {
        return massge;
    }

    public void setMassge(String massge) {
        this.massge = massge;
    }
}
