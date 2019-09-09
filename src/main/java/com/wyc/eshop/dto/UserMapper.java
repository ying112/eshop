package com.wyc.eshop.dto;

import com.wyc.eshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User selectUserById(String id);
}
