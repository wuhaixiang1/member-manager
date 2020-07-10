package com.qianfeng.hai.service;

import com.qianfeng.hai.domain.dto.UserDto;
import com.qianfeng.hai.domain.entity.User;
import com.qianfeng.hai.exception.ControllerException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //查询按关键字
    List<User> selectByKeyword(UserDto userDto, int page, int size);
    //跟新主表,在更新从表
    UserDto updateByUserId(UserDto userDto) throws ControllerException;

    //批量删除
    int deleteByBatch(List<User> list);
    //添加用户
    int insert(UserDto userDto);
}
