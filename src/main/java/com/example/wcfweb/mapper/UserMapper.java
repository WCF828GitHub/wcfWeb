package com.example.wcfweb.mapper;

import com.example.wcfweb.entity.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public Users checkUserByNameAndPassWord(Users users);
}
