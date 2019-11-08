package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    @Value("${MAX_VALUE}")
    public String MAX_VALUE;

    @Autowired
    public TestService testService;

    @ResponseBody
    @RequestMapping("/test")
    public String test1(String name){
        System.out.println(name);
        return testService.getHello(name);
    }
}
