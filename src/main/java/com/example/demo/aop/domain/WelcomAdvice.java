package com.example.demo.aop.domain;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class WelcomAdvice implements MethodBeforeAdvice {
    /**
     * 方法前置增强
     * @param method 调用的方法
     * @param objects
     * @param o
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("你好！");
    }
}
