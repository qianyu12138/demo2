package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testSort(){
        Integer[] arr = {2,4,3,6,5,7};
        List<Integer> list = Arrays.asList(arr);
        list.sort((a,b)-> {
            int result = a>b?1:-1;
           return result;
        });
        System.out.println(list);
    }

    @Test
    public void testStringCompare(){
        String[] arr = {"ab","ac","aa","1990","1991","1989"};
        List<String> list = Arrays.asList(arr);
        list.sort(String::compareTo);
        System.out.println(list);
    }

    @Test
    public void test1(){
        Map<String,String> map = new HashMap<>();
        map.put("1","hello");
        System.out.println(map.get(49));
    }

    @Test
    public void fun1(){
        MethodHolder holder = new MethodHolder();

        Integer a = 1;
        MethodExecutor executor = a==1 ? holder::doIt1 : holder::doIt2;

        String s = executor.doIt(1);
        System.out.println(s);
    }
}
