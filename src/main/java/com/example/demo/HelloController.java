package com.example.demo;

import com.example.demo.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private ScoreService scoreService;


    @RequestMapping(value = "/hello")
    public List<String> hello(){
        return scoreService.queryDemo();
    }
}
