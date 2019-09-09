package com.wyc.eshop.controller;

import com.wyc.eshop.pojo.User;
import com.wyc.eshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping(value = "cs")
    public User cs() {
        User user = iUserService.cs();
        return user;
    }

}
