package com.example.demo.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiyunlong
 * @created 2019/11/8
 */

@RestController
public class Test2Controller {

    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

}
