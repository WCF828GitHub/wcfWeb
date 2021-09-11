package com.example.wcfweb.utils;

import com.example.wcfweb.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate redisTemplate;
    public boolean hasKey(Users users){
        return redisTemplate.hasKey(users.getName());
    }
    public boolean addStr(Users users){
        boolean result=false;
        try {
            redisTemplate.opsForValue().set(users.getName(),users.getPassWord());
            result=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
