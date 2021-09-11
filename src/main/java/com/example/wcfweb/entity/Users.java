package com.example.wcfweb.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Users {
    private int id;
    private String name;
    private String passWord;
    private int sex;
    private Date createDate;
    private Date updateTime;
    private String hobby;
    private String sketck;

}
