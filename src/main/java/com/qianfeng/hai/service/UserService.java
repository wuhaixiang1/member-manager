package com.qianfeng.hai.service;

import com.qianfeng.hai.domain.dto.UserDto;
import com.qianfeng.hai.domain.entity.User;

import java.util.List;

public interface UserService {
    //查询按关键字
    List<User> selectByKeyword(UserDto userDto, int page, int size);
    //跟新主表,在更新从表
    public UserDto selectByUserId(UserDto userDto);
}
