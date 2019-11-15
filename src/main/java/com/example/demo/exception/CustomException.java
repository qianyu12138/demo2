package com.example.demo.exception;

/**
 * @author shiyunlong
 * @created 2019/11/15
 * 自定义异常类
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
