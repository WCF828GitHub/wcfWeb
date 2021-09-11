package com.example.wcfweb.service.impl;

import com.example.wcfweb.entity.Users;
import com.example.wcfweb.mapper.UserMapper;
import com.example.wcfweb.service.UserService;
import com.example.wcfweb.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public boolean checkUserByNameAndPassWord(Users users) {
        boolean result=false;
        if( redisUtil.hasKey(users)){
            result= true;
        }else {
            Users users1=userMapper.checkUserByNameAndPassWord(users);
            if(users1!=null){
                redisUtil.addStr(users1);
                result=true;
            }
        }

        return result;
    }
}
