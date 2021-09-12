package com.wang.springbootswagger2.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version 1.0
 * @Aythor lucksoul 王吉慧
 * @date 2021/9/12 11:14
 * @description
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentAnno {
    String value() default "";
}
