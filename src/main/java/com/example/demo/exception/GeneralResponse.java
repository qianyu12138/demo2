package com.example.demo.exception;

/**
 * @author shiyunlong
 * @created 2019/11/15
 */
public class GeneralResponse {

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private GeneralResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static GeneralResponse success(String msg){
        return new GeneralResponse(1,msg);
    }
    public static GeneralResponse error(String msg){
        return new GeneralResponse(4,msg);
    }
}
