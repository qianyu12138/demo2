package com.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shiyunlong
 * @created 2019/11/15
 * 全局异常处理器
 */

//component，如果全部是json返回可用@RestControllerAdvice代替
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(CustomException.class)//捕获目标异常类
    public GeneralResponse customExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response){

        logger.error("CustomException catch!");
        logger.error("first param",e);//异常放第二个参数才能打印异常栈
        return GeneralResponse.error(e.getMessage());//将异常的信息传入返回的信息
    }

    //此处返回自定义异常结果页面
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView customExceptionHandler2(HttpServletRequest request, final Exception e, HttpServletResponse response){

        logger.error("CustomException catch!");
        logger.error("first param",e);
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMsg",e.getMessage());
        mav.setViewName("error.html");
        return mav;
    }
}
