package com.krxinuo.aspect;


import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Operation {


    /** 要执行的操作类型比如：add操作 **/  
    String operationType() default "";

    /** 要执行的具体操作比如：添加用户 **/  
    String operationName() default "";

}