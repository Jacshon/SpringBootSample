package com.wwj.server.common.exception;

/**
 * 自定义异常，区别与其他系统异常（如NullPointException)
 * 注意此处异常继承的类是Exception(Checked Exceptioin),
 * 而不是RuntimeException(Unchecked Exception)
 *
 * Author: WWJ
 * Date: 2018/1/9 10:50
 */
public class CustomerException extends Exception{

    private Integer code;

    public CustomerException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
