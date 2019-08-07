package com.example.demo.service;

import com.example.demo.mapper.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    public List<String> queryDemo(){
        return scoreDao.queryAll();
    }
}
