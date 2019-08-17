package com.example.demo.controller;

import com.example.demo.domain.Boss;
import com.example.demo.domain.Car;
import com.example.demo.service.ScoreService;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class HelloController {
    
    @RequestMapping(value = "/hello")
    public String hello(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(factory);
        xmlReader.loadBeanDefinitions("classpath:testBeanxml.xml");
        Boss d = factory.getBean(Boss.class);
        return d.say();
    }
    @RequestMapping(value = "/jdbc")
    public String datasourceTest() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(factory);
        xmlReader.loadBeanDefinitions("classpath:testBeanxml.xml");
        PooledDataSource dataSource = factory.getBean(PooledDataSource.class);
        boolean execute = false;
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            execute = statement.execute("select * from score");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Boolean.toString(execute);
    }

    public static void main(String[] args) {
        Class<?>[] interfaces = Car.class.getInterfaces();
        System.out.println("sss");
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
