package com.wyc.eshop.service.impl;

import com.wyc.eshop.dto.UserMapper;
import com.wyc.eshop.pojo.User;
import com.wyc.eshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    //依赖注入
    @Autowired
    UserMapper userMapper;

    public User cs() {
        //调用dao层
        User user = userMapper.selectUserById("1");
        return user;
    }
}
