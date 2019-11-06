package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestService {

    @Cacheable(value="hel",key = "#root.methodName+#root.args[0]",unless = "#result == null")
    public String getHello(String name){
        System.out.println("getHello");
        if(StringUtils.isEmpty(name)){
            return null;
        }
        //bth2
        //bth22
        return "hello world"+name;
    }
}
