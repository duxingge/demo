package com.example.demo.common.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Mapper
public interface ScoreDao {
    @Select("select * from score")
    public List<String> queryAll();
}
