package com.example.wcfweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.wcfweb.mapper")
public class WcfWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WcfWebApplication.class, args);
    }

}
