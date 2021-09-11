package com.example.wcfweb.controller;

import com.example.wcfweb.entity.Users;
import com.example.wcfweb.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    private Log log=LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(Users users){
         log.info(users);
         if(users.getName()!=null&&users.getPassWord()!=null){
             boolean result=userService.checkUserByNameAndPassWord(users);

         }
         return "main";
    }
}
