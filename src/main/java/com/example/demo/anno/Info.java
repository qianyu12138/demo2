package com.example.demo.anno;

import java.lang.annotation.*;

/**
 * @author shiyunlong
 * @created 2019/11/28
 */
@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
}
