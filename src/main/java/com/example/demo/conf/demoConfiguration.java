package com.example.demo.conf;


import com.example.demo.common.domain.Boss;
import com.example.demo.common.domain.Car;
import org.springframework.context.annotation.*;

@Configuration
public class demoConfiguration {

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public Boss boss(){
        Boss boss = new Boss();
        boss.setCar(car());
        return boss;
    }
}
