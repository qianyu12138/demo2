package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Value("${MAX_VALUE}")
    public String MAX_VALUE;

    @Autowired
    public TestService testService;

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test")
    public String test1(String name){
        System.out.println(name);
        return testService.getHello(name);
    }

    @RequestMapping("/log")
    public String testLog(String name){
        logger.info("{} world","hello");
        logger.error("error");
        return testService.getHello(name);
    }

    @RequestMapping("/exception")
    public String testException(){
        if(1==1)
            throw new CustomException("千万不能让1==1");
        return "error!";
    }
}
