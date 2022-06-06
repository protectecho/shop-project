package com.cai.test.dao;

import lombok.Data;

import java.sql.Time;

@Data
public class Actor {
    private Integer id;
    private String name;
    private Time updateTime;
}
