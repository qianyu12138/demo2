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
        //feature_3
        return "hello world"+name;
    }

    /**
     * @author a1
     */
    public void controller(String a) {
        if (a != null) {
            service(a);
        } else {

        }
    }
    private void service(String str){
        System.out.println(str.length());
    }

    /**
     * @author a2
     */
    public void controller2(String a){
        service(a);
    }

}
