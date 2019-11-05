package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Cacheable(value="hel",key = "#root.methodName+#root.args[0]")
    public String getHello(String name){
        System.out.println("getHello");
        return "hello world"+name;
    }
}
