package com.example.demo.common.controller;

import com.example.demo.common.domain.Boss;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationHandler;

/**
 * 属性编辑器测试Controller
 */
@RestController
public class PropEditorController {

    @RequestMapping(value = "/bossCar")
    public String bossCar() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        PathMatchingResourcePatternResolver p = new PathMatchingResourcePatternResolver();
        Resource resource = p.getResource("classpath:testBeanxml.xml");
        reader.loadBeanDefinitions(resource);
        Boss boss = factory.getBean(Boss.class);
        InvocationHandler.class.getInterfaces();
        return boss.say();
    }
}
