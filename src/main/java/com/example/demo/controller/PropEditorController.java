package com.example.demo.controller;

import com.example.demo.domain.Boss;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return boss.say();
    }
}
