package com.example.demo.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代理测试Controller
 */
@RestController
public class ProxyController {
    /**
     * JDK动态代理主要涉及两个类Propxy和InvocationHandler
     * @return
     */
    @RequestMapping("/jdkDynamicProxy")
    public String javaDynamicProxy() {
        return "";
    }
}
