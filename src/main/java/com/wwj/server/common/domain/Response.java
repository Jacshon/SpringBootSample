package com.wwj.server.common.domain;

import com.wwj.server.common.constant.StatusCode;

public class Response {
    private Integer code;
    private String message;
    private Object data;

    public Response() {
    }

    public Response(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Response(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMsg();
        this.data = null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Response ok() {
        return ok(null);
    }

    public static Response ok(Object object) {
        Response response = new Response(StatusCode.SUCCESS);
        response.setData(object);
        return response;
    }

    public static Response error() {
        return new Response(StatusCode.ERROR);
    }

    public static Response error(Integer code, String message) {
        Response response = new Response(StatusCode.ERROR);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

}
