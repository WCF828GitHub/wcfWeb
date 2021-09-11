package com.example.wcfweb.service;

import com.example.wcfweb.entity.Users;
import org.springframework.stereotype.Service;

public interface UserService {
    boolean checkUserByNameAndPassWord(Users users);
}
